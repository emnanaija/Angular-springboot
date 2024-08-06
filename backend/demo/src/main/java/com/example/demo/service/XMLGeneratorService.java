package com.example.demo.service;

import com.example.demo.dao.RetenuFourRepository;
import com.example.demo.entity.Retenue_four;
import com.example.generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class XMLGeneratorService {

    @Autowired
    private RetenuFourRepository retenuFourRepository;

    private static final String XSD_PATH = "C:\\Users\\chemseddine\\Desktop\\stage3eme\\backend\\demo\\src\\main\\resources\\xsd\\TEJDeclarationRS_v1.0.xsd";

    public String generateXML(Long frtMatcin, String frtClepat, Integer frtMois, Integer frtAnnee) {
        try {
            Optional<Retenue_four> retenueFourOptional = retenuFourRepository.findByFrtMatcinAndFrtClepatAndFrtMoisAndFrtAnnee(frtMatcin, frtClepat, frtMois, frtAnnee);
            if (retenueFourOptional.isPresent()) {
                Retenue_four retenueFour = retenueFourOptional.get();

                DeclarationsRS declarationsRS = new DeclarationsRS();
                fillDeclarationsRS(declarationsRS, retenueFour);

                JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationsRS.class);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                StringWriter xmlWriter = new StringWriter();
                marshaller.marshal(declarationsRS, xmlWriter);

                String xmlContent = xmlWriter.toString();

                // Validate the generated XML
                boolean isValid = validateXML(xmlContent);
                if (!isValid) {
                    System.out.println("Generated XML is not valid against the schema.");
                    return "Generated XML is not valid against the schema.";
                }

                System.out.println("Generated XML is valid against the schema.");
                return xmlContent;
            } else {
                System.out.println("Matricule not found");
                return "Matricule not found";
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error generating XML");
            return "Error generating XML";
        }
    }

    private void fillDeclarationsRS(DeclarationsRS declarationsRS, Retenue_four retenueFour) {
        declarationsRS.setVersionSchema("1.0");

        // Création d'une instance de TypeMatriculeFiscal
        TypeMatriculeFiscal declarant = new TypeMatriculeFiscal();

        // Définir le type d'identifiant
        declarant.setTypeIdentifiant(String.valueOf(retenueFour.getFrtTypIdent()));

        // Récupérer frtMatcin en tant que Long
        Long frtMatcinLong = retenueFour.getFrtMatcin();

        // Ajouter des zéros au début pour s'assurer qu'il a toujours 7 chiffres
        String frtMatcinFormatted = String.format("%07d", frtMatcinLong);

        // Vérifier que frtClepat est une seule lettre majuscule
        String frtClepat = retenueFour.getFrtClepat();
        if (frtClepat.length() != 1 || !Character.isUpperCase(frtClepat.charAt(0))) {
            throw new IllegalArgumentException("frtClepat doit être une seule lettre majuscule.");
        }

        // Combiner frtMatcin formaté et frtClepat pour obtenir l'identifiant complet
        String identifiant = frtMatcinFormatted + frtClepat;

        // Vérifier que l'identifiant respecte le schéma \d{7}[A-Z]
        if (!identifiant.matches("\\d{7}[A-Z]")) {
            throw new IllegalArgumentException("L'identifiant ne respecte pas le format attendu: " + identifiant);
        }

        // Définir l'identifiant dans le déclarant
        declarant.setIdentifiant(identifiant);

        // Définir la catégorie du contribuable
        String transformedCategory = transformCategory(retenueFour.getFrtCateg());
        declarant.setCategorieContribuable(TypeCategoriePersonne.fromValue(transformedCategory));

        // Assigner le déclarant aux déclarations
        declarationsRS.setDeclarant(declarant);

        TypeReferenceDeclaration referenceDeclaration = new TypeReferenceDeclaration();
        referenceDeclaration.setActeDepot("0");
        referenceDeclaration.setAnneeDepot("2024");
        referenceDeclaration.setMoisDepot("01");
        declarationsRS.setReferenceDeclaration(referenceDeclaration);

        DeclarationsRS.AjouterCertificats ajouterCertificats = new DeclarationsRS.AjouterCertificats();
        List<TypeCertificat> certificatList = new ArrayList<>();
        TypeCertificat certificat = new TypeCertificat();
        certificat.setBeneficiaire(createTypeTaxpayer(retenueFour));
        certificat.setDatePayement("31/12/2023");
        certificat.setRefCertifChezDeclarant("CERT123456");
        certificat.setListeOperations(createListeOperations());
        certificat.setTotalPayement(createTotalPayement());
        certificatList.add(certificat);
        ajouterCertificats.getCertificat().addAll(certificatList);
        declarationsRS.setAjouterCertificats(ajouterCertificats);

        DeclarationsRS.ModifierCertificats modifierCertificats = new DeclarationsRS.ModifierCertificats();
        modifierCertificats.getCertificat().add(certificat);
        declarationsRS.setModifierCertificats(modifierCertificats);

        DeclarationsRS.AnnulerCertificats annulerCertificats = new DeclarationsRS.AnnulerCertificats();
        TypeAnnulerCertificat annulerCertificat = new TypeAnnulerCertificat();
        annulerCertificat.setRefCertifChezDeclarant("CERT123456");
        annulerCertificats.getCertificat().add(annulerCertificat);
        declarationsRS.setAnnulerCertificats(annulerCertificats);
    }

    private TypeTaxpayer createTypeTaxpayer(Retenue_four retenueFour) {
        TypeTaxpayer taxpayer = new TypeTaxpayer();
        TypeTaxpayer.IdTaxpayer idTaxpayer = new TypeTaxpayer.IdTaxpayer();
        TypeMatriculeFiscal matriculeFiscal = new TypeMatriculeFiscal();
        matriculeFiscal.setTypeIdentifiant(String.valueOf(retenueFour.getFrtTypIdent()));

        // Formater correctement l'identifiant
        Long frtMatcinLong = retenueFour.getFrtMatcin();
        String frtMatcinFormatted = String.format("%07d", frtMatcinLong);
        String frtClepat = retenueFour.getFrtClepat();
        if (frtClepat.length() != 1 || !Character.isUpperCase(frtClepat.charAt(0))) {
            throw new IllegalArgumentException("frtClepat doit être une seule lettre majuscule.");
        }
        String identifiant = frtMatcinFormatted + frtClepat;
        if (!identifiant.matches("\\d{7}[A-Z]")) {
            throw new IllegalArgumentException("L'identifiant ne respecte pas le format attendu: " + identifiant);
        }

        // Définir l'identifiant dans le matricule fiscal
        matriculeFiscal.setIdentifiant(identifiant);

        // Transformer la catégorie du contribuable
        String transformedCategory = transformCategory(retenueFour.getFrtCateg());
        matriculeFiscal.setCategorieContribuable(TypeCategoriePersonne.fromValue(transformedCategory));
        idTaxpayer.setMatriculeFiscal(matriculeFiscal);
        taxpayer.setIdTaxpayer(idTaxpayer);
        taxpayer.setResident(BigInteger.ONE);
        taxpayer.setNometprenonOuRaisonsociale(retenueFour.getFrtRaisocial());
        taxpayer.setAdresse(retenueFour.getFrtAdresse());
        taxpayer.setActivite(retenueFour.getFrtActiv());
        TypeAdresseContact adresseContact = new TypeAdresseContact();
        adresseContact.setAdresseMail("example@example.com"); // Ajoutez les champs réels si disponibles
        adresseContact.setNumTel("123456789"); // Ajoutez les champs réels si disponibles
        taxpayer.setInfosContact(adresseContact);
        return taxpayer;
    }

    private String transformCategory(String category) {
        switch (category) {
            case "P":
                return "PP";
            case "M":
                return "PM";
            default:
                throw new IllegalArgumentException("Catégorie inconnue : " + category);
        }
    }

    private TypeCertificat.ListeOperations createListeOperations() {
        TypeCertificat.ListeOperations listeOperations = new TypeCertificat.ListeOperations();
        List<TypeOperation> operationList = new ArrayList<>();
        TypeOperation operation = new TypeOperation();
        operation.setIdTypeOperation(TypeCodesOperations.RS_1_000001);  // Assurez-vous de définir une valeur valide

        operation.setAnneeFacturation("2023");
        operation.setCNPC(BigInteger.ONE);
        operation.setPCharge(BigInteger.ONE);
        operation.setMontantHT(BigInteger.valueOf(100000));
        operation.setTauxRS(BigDecimal.valueOf(15.00));
        operation.setTauxTVA(BigDecimal.valueOf(19.00));
        operation.setMontantTVA(BigInteger.valueOf(19000));
        operation.setMontantTTC(BigInteger.valueOf(119000));
        operation.setMontantRS(BigInteger.valueOf(15000));
        operation.setMontantNetServi(BigInteger.valueOf(104000));
        operation.setDevise(createTypeMontantDevise());
        operation.getTaxeAdditionnelle().addAll(createTaxeAdditionnelle());
        operationList.add(operation);
        listeOperations.getOperation().addAll(operationList);
        return listeOperations;
    }

    private List<TaxeType> createTaxeAdditionnelle() {
        List<TaxeType> taxeAdditionnelleList = new ArrayList<>();
        TaxeType taxeAdditionnelle = new TaxeType();
        taxeAdditionnelle.setCode("RSTVA100");
        taxeAdditionnelle.setValue(BigDecimal.valueOf(100.00));
        taxeAdditionnelleList.add(taxeAdditionnelle);
        return taxeAdditionnelleList;
    }

    private TypeMontantDevise createTypeMontantDevise() {
        TypeMontantDevise devise = new TypeMontantDevise();
        devise.setCodeDevise(TypeCodeDevise.USD);
        devise.setTauxChange(BigDecimal.valueOf(1.1));
        devise.setMontantRSDevise(BigDecimal.valueOf(13636.36));
        devise.setMontantTTCDevise(BigDecimal.valueOf(108181.82));
        devise.setMontantNetServiDevise(BigDecimal.valueOf(94545.45));
        return devise;
    }

    private TypeCertificat.TotalPayement createTotalPayement() {
        TypeCertificat.TotalPayement totalPayement = new TypeCertificat.TotalPayement();
        totalPayement.setTotalMontantHT(BigInteger.valueOf(100000));
        totalPayement.setTotalMontantTVA(BigInteger.valueOf(19000));
        totalPayement.setTotalMontantTTC(BigInteger.valueOf(119000));
        totalPayement.setTotalMontantRS(BigInteger.valueOf(15000));
        TotalMontantTaxeType totalTaxes = new TotalMontantTaxeType();
        List<TotalMontantTaxeType.TotalTaxeAdditionnelle> totalTaxeAdditionnelleList = new ArrayList<>();
        TotalMontantTaxeType.TotalTaxeAdditionnelle totalTaxeAdditionnelle = new TotalMontantTaxeType.TotalTaxeAdditionnelle();
        totalTaxeAdditionnelle.setCode("TAX1");
        totalTaxeAdditionnelle.setMontant(BigDecimal.valueOf(5000));
        totalTaxeAdditionnelleList.add(totalTaxeAdditionnelle);
        totalTaxes.getTotalTaxeAdditionnelle().addAll(totalTaxeAdditionnelleList);
        totalPayement.setTotalTaxes(totalTaxes);
        totalPayement.setTotalMontantNetServi(BigInteger.valueOf(104000));

        // Add TotalDevise
        totalPayement.setTotalDevise(createTotalDevise());

        return totalPayement;
    }

    private TotalMntDeviseType createTotalDevise() {
        TotalMntDeviseType totalDevise = new TotalMntDeviseType();
        List<TotalMntDeviseType.TotalMontantDevise> totalMontantDeviseList = new ArrayList<>();
        TotalMntDeviseType.TotalMontantDevise totalMontantDevise = new TotalMntDeviseType.TotalMontantDevise();
        totalMontantDevise.setCode(TypeCodeDevise.USD);
        totalMontantDevise.setTotalMontantRS(BigDecimal.valueOf(13636.36));
        totalMontantDevise.setTotalMontantTTC(BigDecimal.valueOf(108181.82));
        totalMontantDevise.setTotalMontantNetServi(BigDecimal.valueOf(94545.45));
        totalMontantDeviseList.add(totalMontantDevise);
        totalDevise.getTotalMontantDevise().addAll(totalMontantDeviseList);
        return totalDevise;
    }

    private boolean validateXML(String xmlContent) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(XSD_PATH));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new StringReader(xmlContent)));
            return true;
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class XMLGeneratorService {

    @Autowired
    private RetenuFourRepository retenuFourRepository;

    private static final String XSD_PATH = "backend/demo/src/main/resources/xsd/TEJDeclarationRS_v1.0.xsd";


    public String generateXML(String mois, String annee) {
        try {
            System.out.println("Received mois: " + mois + ", annee: " + annee);

            // Validate the input strings for month and year
            if (!isNumeric(mois) || !isNumeric(annee)) {
                System.out.println("Invalid input for month or year.");
                return "Error generating XML due to invalid input";
            }
            System.out.println("Parsing mois and annee: " + mois + " and " + annee);

            // Convert the parameters to Integer
            Integer frtMois = Integer.parseInt(mois);
            Integer frtAnnee = Integer.parseInt(annee);

            System.out.println("Parsed mois: " + frtMois + ", annee: " + frtAnnee);
            // Retrieve filtered data by month and year from the database
            List<Retenue_four> retenueFourList = retenuFourRepository.findByFrtMoisAndFrtAnnee(frtMois, frtAnnee);

            DeclarationsRS declarationsRS = new DeclarationsRS();
            declarationsRS.setVersionSchema("1.0");

            // Define values for the declarant
            TypeMatriculeFiscal declarant = new TypeMatriculeFiscal();
            declarant.setTypeIdentifiant("1");
            declarant.setIdentifiant("1234567A");
            declarant.setCategorieContribuable(TypeCategoriePersonne.PM);
            declarationsRS.setDeclarant(declarant);

            // Define values for the reference declaration
            TypeReferenceDeclaration referenceDeclaration = new TypeReferenceDeclaration();
            referenceDeclaration.setActeDepot("0");
            referenceDeclaration.setAnneeDepot(annee);  // Use the year parameter
            referenceDeclaration.setMoisDepot(mois);    // Use the month parameter
            declarationsRS.setReferenceDeclaration(referenceDeclaration);

            DeclarationsRS.AjouterCertificats ajouterCertificats = new DeclarationsRS.AjouterCertificats();
            List<TypeCertificat> certificatList = new ArrayList<>();

            for (Retenue_four retenueFour : retenueFourList) {
                TypeCertificat certificat = new TypeCertificat();
                certificat.setBeneficiaire(createTypeTaxpayer(retenueFour));
                certificat.setDatePayement("31/12/" + annee); // Use the provided year
                certificat.setRefCertifChezDeclarant("CERT123456");
                certificat.setListeOperations(createListeOperations());
                certificat.setTotalPayement(createTotalPayement());
                certificatList.add(certificat);
            }

            ajouterCertificats.getCertificat().addAll(certificatList);
            declarationsRS.setAjouterCertificats(ajouterCertificats);

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

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error generating XML");
            return "Error generating XML";
        }
    }

    // Helper method to check if a string is numeric
    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private TypeTaxpayer createTypeTaxpayer(Retenue_four retenueFour) {
        TypeTaxpayer taxpayer = new TypeTaxpayer();
        TypeTaxpayer.IdTaxpayer idTaxpayer = new TypeTaxpayer.IdTaxpayer();

        String typeIdentifiant = String.valueOf(retenueFour.getFrtTypIdent());

        switch (typeIdentifiant) {
            case "1":
                idTaxpayer.setMatriculeFiscal(createTypeMatriculeFiscal(retenueFour));
                break;
            case "2":
                idTaxpayer.setCIN(createTypeCIN());
                break;
            case "3":
                idTaxpayer.setPasseport(createTypePasseport());
                break;
            case "4":
                idTaxpayer.setCarteSejour(createTypeCarteSejour());
                break;
            case "5":
                idTaxpayer.setAutreIdentifiantFiscal(createTypeAutreIdentifiant());
                break;
            default:
                throw new IllegalArgumentException("Type d'identifiant inconnu : " + typeIdentifiant);
        }

        taxpayer.setIdTaxpayer(idTaxpayer);
        taxpayer.setResident(BigInteger.ONE);
        taxpayer.setNometprenonOuRaisonsociale(retenueFour.getFrtRaisocial());
        taxpayer.setAdresse("123 Example Street, Example City");
        taxpayer.setActivite(retenueFour.getFrtActiv());

        TypeAdresseContact adresseContact = new TypeAdresseContact();
        adresseContact.setAdresseMail("example@example.com");
        adresseContact.setNumTel("123456789");
        taxpayer.setInfosContact(adresseContact);

        return taxpayer;
    }

    private TypeMatriculeFiscal createTypeMatriculeFiscal(Retenue_four retenueFour) {
        TypeMatriculeFiscal matriculeFiscal = new TypeMatriculeFiscal();
        matriculeFiscal.setTypeIdentifiant("1");

        String identifiant;
        Long frtMatcinLong = retenueFour.getFrtMatcin();
        String frtMatcinFormatted = String.format("%07d", frtMatcinLong);
        String frtClepat = retenueFour.getFrtClepat();

        if (frtClepat == null || frtClepat.length() != 1 || !Character.isUpperCase(frtClepat.charAt(0))) {
            frtClepat = "A"; // Valeur par défaut si frtClepat est invalide
            System.out.println("frtClepat invalide. Utilisation de la valeur par défaut: " + frtClepat);
        }

        identifiant = frtMatcinFormatted + frtClepat;
        if (!identifiant.matches("\\d{7}[A-Z]")) {
            throw new IllegalArgumentException("L'identifiant ne respecte pas le format attendu: " + identifiant);
        }

        matriculeFiscal.setIdentifiant(identifiant);
        String transformedCategory = transformCategory(retenueFour.getFrtCateg());
        matriculeFiscal.setCategorieContribuable(TypeCategoriePersonne.fromValue(transformedCategory));

        return matriculeFiscal;
    }

    private TypeCIN createTypeCIN() {
        TypeCIN cin = new TypeCIN();
        cin.setTypeIdentifiant("2");
        cin.setIdentifiant("12345678");
        cin.setDateNaissance("01/01/1990");
        cin.setCategorieContribuable(TypeCategoriePersonne.PP);
        return cin;
    }

    private TypePasseport createTypePasseport() {
        TypePasseport passeport = new TypePasseport();
        passeport.setTypeIdentifiant("3");
        passeport.setIdentifiant("P1234567");
        passeport.setDateNaissance("01/01/1990");
        passeport.setPays(TypeCodesPays.AD);
        passeport.setCategorieContribuable(TypeCategoriePersonne.PP);
        return passeport;
    }

    private TypeCarteSejour createTypeCarteSejour() {
        TypeCarteSejour carteSejour = new TypeCarteSejour();
        carteSejour.setTypeIdentifiant("4");
        carteSejour.setIdentifiant("S1234567");
        carteSejour.setDateNaissance("01/01/1990");
        carteSejour.setPays(TypeCodesPays.AD);
        carteSejour.setCategorieContribuable(TypeCategoriePersonne.PP);
        return carteSejour;
    }

    private TypeAutreIdentifiant createTypeAutreIdentifiant() {
        TypeAutreIdentifiant autreIdentifiant = new TypeAutreIdentifiant();
        autreIdentifiant.setTypeIdentifiant("5");
        autreIdentifiant.setIdentifiant("A1234567");
        autreIdentifiant.setPays(TypeCodesPays.AD);
        autreIdentifiant.setCategorieContribuable(TypeCategoriePersonne.PM);
        return autreIdentifiant;
    }

    private String transformCategory(String category) {
        if (category == null) {
            return "PM";
        }

        switch (category) {
            case "P":
            case "PP":
                return "PP";
            case "M":
            case "A":
            case "PM":
            case "N":
            case "C":
                return "PM";
            default:
                throw new IllegalArgumentException("Catégorie inconnue : " + category);
        }
    }

    private TypeCertificat.ListeOperations createListeOperations() {
        TypeCertificat.ListeOperations listeOperations = new TypeCertificat.ListeOperations();
        List<TypeOperation> operationList = new ArrayList<>();
        TypeOperation operation = new TypeOperation();
        operation.setIdTypeOperation(TypeCodesOperations.RS_1_000001);

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
            // Utilisez le chemin relatif ici
            File schemaFile = new File(XSD_PATH);
            if (!schemaFile.exists()) {
                System.out.println("Schema file not found: " + schemaFile.getAbsolutePath());
                return false;
            }
            Schema schema = factory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new StringReader(xmlContent)));
            return true;
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}


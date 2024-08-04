package com.example.demo.service;

import com.example.generated.*;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class XMLGeneratorService {

    public String generateXML() {
        try {
            DeclarationsRS declarationsRS = new DeclarationsRS();
            fillDeclarationsRS(declarationsRS);

            JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationsRS.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter xmlWriter = new StringWriter();
            marshaller.marshal(declarationsRS, xmlWriter);
            return xmlWriter.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error generating XML";
        }
    }

    private void fillDeclarationsRS(DeclarationsRS declarationsRS) {
        declarationsRS.setVersionSchema("1.0");

        TypeMatriculeFiscal declarant = new TypeMatriculeFiscal();
        declarant.setTypeIdentifiant("1");
        declarant.setIdentifiant("1234567A");
        declarant.setCategorieContribuable(TypeCategoriePersonne.PM);
        declarationsRS.setDeclarant(declarant);

        TypeReferenceDeclaration referenceDeclaration = new TypeReferenceDeclaration();
        referenceDeclaration.setActeDepot("0");
        referenceDeclaration.setAnneeDepot("2024");
        referenceDeclaration.setMoisDepot("01");
        declarationsRS.setReferenceDeclaration(referenceDeclaration);

        DeclarationsRS.AjouterCertificats ajouterCertificats = new DeclarationsRS.AjouterCertificats();
        List<TypeCertificat> certificatList = new ArrayList<>();
        TypeCertificat certificat = new TypeCertificat();
        certificat.setBeneficiaire(createTypeTaxpayer());
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

    private TypeTaxpayer createTypeTaxpayer() {
        TypeTaxpayer taxpayer = new TypeTaxpayer();
        TypeTaxpayer.IdTaxpayer idTaxpayer = new TypeTaxpayer.IdTaxpayer();
        TypeMatriculeFiscal matriculeFiscal = new TypeMatriculeFiscal();
        matriculeFiscal.setTypeIdentifiant("1");
        matriculeFiscal.setIdentifiant("1234567A");
        matriculeFiscal.setCategorieContribuable(TypeCategoriePersonne.PM);
        idTaxpayer.setMatriculeFiscal(matriculeFiscal);
        taxpayer.setIdTaxpayer(idTaxpayer);
        taxpayer.setResident(BigInteger.ONE);
        taxpayer.setNometprenonOuRaisonsociale("Example Company");
        taxpayer.setAdresse("123 Example Street, Example City");
        taxpayer.setActivite("Software Development");
        TypeAdresseContact adresseContact = new TypeAdresseContact();
        adresseContact.setAdresseMail("example@example.com");
        adresseContact.setNumTel("123456789");
        taxpayer.setInfosContact(adresseContact);
        return taxpayer;
    }

    private TypeCertificat.ListeOperations createListeOperations() {
        TypeCertificat.ListeOperations listeOperations = new TypeCertificat.ListeOperations();
        List<TypeOperation> operationList = new ArrayList<>();
        TypeOperation operation = new TypeOperation();
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
        operation.setDevise(new TypeMontantDevise());
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
        return totalPayement;
    }
}

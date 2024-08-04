package com.example.demo.service;

import com.example.generated.DeclarationsRS;
import com.example.generated.TypeMatriculeFiscal;
import com.example.generated.TypeReferenceDeclaration;
import com.example.generated.TypeCategoriePersonne;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.XMLConstants;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.xml.sax.SAXException;

@Service
public class XMLGeneratorService {

    public String generateXML() {
        try {
            // Générer une partie de l'objet DeclarationsRS
            DeclarationsRS declarationsRS = new DeclarationsRS();
            fillDeclarationsRS(declarationsRS);

            // Convertir l'objet en XML
            JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationsRS.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter xmlWriter = new StringWriter();
            marshaller.marshal(declarationsRS, xmlWriter);
            String xmlString = xmlWriter.toString();

            // Valider le XML généré par rapport au schéma XSD
            String validationMessage = validateXML(xmlString);
            System.out.println(validationMessage); // Afficher le message de validation dans la console
            if (validationMessage.equals("XML validation succeeded!")) {
                return xmlString;
            } else {
                return validationMessage;
            }

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

        // Définir la valeur de l'énumération TypeCategoriePersonne
        declarant.setCategorieContribuable(TypeCategoriePersonne.PM);

        declarationsRS.setDeclarant(declarant);

        TypeReferenceDeclaration referenceDeclaration = new TypeReferenceDeclaration();
        referenceDeclaration.setActeDepot("0");
        referenceDeclaration.setAnneeDepot("2024");
        referenceDeclaration.setMoisDepot("08");
        declarationsRS.setReferenceDeclaration(referenceDeclaration);

        // Ne pas remplir les autres champs pour l'instant
    }

    private String validateXML(String xmlString) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File("C:\\Users\\chemseddine\\Desktop\\stage3eme\\backend\\demo\\src\\main\\resources\\xsd\\TEJDeclarationRS_v1.0.xsd"));

            javax.xml.validation.Validator validator = schema.newValidator();

            // Ajout d'un ErrorHandler pour capturer les erreurs de validation
            validator.setErrorHandler(new org.xml.sax.ErrorHandler() {
                @Override
                public void warning(org.xml.sax.SAXParseException exception) throws SAXException {
                    System.out.println("Warning: " + exception.getMessage());
                }

                @Override
                public void error(org.xml.sax.SAXParseException exception) throws SAXException {
                    System.out.println("Error: " + exception.getMessage());
                }

                @Override
                public void fatalError(org.xml.sax.SAXParseException exception) throws SAXException {
                    System.out.println("Fatal error: " + exception.getMessage());
                }
            });

            validator.validate(new StreamSource(new StringReader(xmlString)));
            System.out.println("XML validation succeeded!");
            return "XML validation succeeded!";
        } catch (SAXException | IOException e) {
            System.out.println("XML validation failed: " + e.getMessage());
            return "XML validation failed: " + e.getMessage();
        }
    }


}

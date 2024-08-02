package com.example.demo.service;

import com.example.demo.entity.Retenue_four;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.List;

@Service
public class XMLGeneratorService {

    public String generateXML(List<Retenue_four> retenueFours) {
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            // Root element
            Element root = document.createElement("Declarants");
            document.appendChild(root);

            for (Retenue_four retenue : retenueFours) {
                // Declarant element
                Element declarant = document.createElement("Declarant");

                // Add value based on FRT_TYPIDENT
                if (retenue.getFrtTypIdent() == 1) {
                    declarant.appendChild(document.createTextNode("1"));
                } else {
                    declarant.appendChild(document.createTextNode(String.valueOf(retenue.getFrtMatcin())));
                }

                root.appendChild(declarant);
            }

            // Transform document to string
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));

            return writer.getBuffer().toString();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.example.demo;
import com.example.demo.dao.RetenuFourRepository;
import com.example.demo.entity.Retenue_four;
import com.example.demo.service.XMLGeneratorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class XMLGeneratorServiceTest {

    @Mock
    private RetenuFourRepository retenuFourRepository;

    @InjectMocks
    private XMLGeneratorService xmlGeneratorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateXMLValidInput() {
        // Arrange: set up mock data
        List<Retenue_four> mockList = new ArrayList<>();
        Retenue_four retenue = new Retenue_four();
        retenue.setFrtMois(1);
        retenue.setFrtAnnee(2024);  // Use valid year 2024
        retenue.setFrtTypIdent(1);
        retenue.setFrtMatcin(1234567L);
        retenue.setFrtClepat("A");
        retenue.setFrtRaisocial("Example Company");
        retenue.setFrtActiv("Commerce");
        mockList.add(retenue);

        when(retenuFourRepository.findByFrtMoisAndFrtAnnee(1, 2024)).thenReturn(mockList);

        // Act: call the method to test with valid inputs
        String xmlResult = xmlGeneratorService.generateXML("01", "2024");

        // Debug: Print the generated XML
        System.out.println("Generated XML: " + xmlResult);

        // Assert: Check that the XML is not null or empty
        assertNotNull(xmlResult, "The generated XML should not be null");
        assertFalse(xmlResult.isEmpty(), "The generated XML should not be empty");

        // Assert: parse XML and check if the root element is <DeclarationsRS>
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(xmlResult.getBytes(StandardCharsets.UTF_8)));

            // Check root element name
            String rootElementName = document.getDocumentElement().getNodeName();
            assertEquals("DeclarationsRS", rootElementName, "Root element should be <DeclarationsRS>");

            // Additional checks to validate the structure/content of the XML
            assertTrue(document.getElementsByTagName("Declarant").getLength() > 0, "XML should contain a <Declarant> element");
            assertTrue(document.getElementsByTagName("ReferenceDeclaration").getLength() > 0, "XML should contain a <ReferenceDeclaration> element");

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while parsing XML: " + e.getMessage());
        }
    }



}

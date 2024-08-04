package com.example.demo.controller;

import com.example.demo.service.XMLGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class XMLController {

    @Autowired
    private XMLGeneratorService xmlGeneratorService;

    @GetMapping("/generate-xml")
    public ResponseEntity<String> generateXML() {
        String xmlOutput = xmlGeneratorService.generateXML();
        if (xmlOutput.startsWith("XML validation failed")) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.INTERNAL_SERVER_ERROR);
        } else if (xmlOutput.equals("Error generating XML")) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(org.springframework.http.MediaType.APPLICATION_XML);
            headers.setContentDispositionFormData("attachment", "declarants.xml");
            headers.add("Validation-Status", "XML validation succeeded!");
            return new ResponseEntity<>(xmlOutput, headers, HttpStatus.OK);
        }
    }
}
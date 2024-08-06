package com.example.demo.controller;

import com.example.demo.service.XMLGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class XMLController {

    @Autowired
    private XMLGeneratorService xmlGeneratorService;

    @GetMapping("/generate-xml/{frtMatcin}/{frtClepat}/{frtMois}/{frtAnnee}")
    public ResponseEntity<String> generateXML(
            @PathVariable Long frtMatcin,
            @PathVariable String frtClepat,
            @PathVariable Integer frtMois,
            @PathVariable Integer frtAnnee) {
        String xmlOutput = xmlGeneratorService.generateXML(frtMatcin, frtClepat, frtMois, frtAnnee);

        if (xmlOutput.equals("Matricule not found")) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.NOT_FOUND);
        } else if (xmlOutput.equals("Error generating XML")) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.INTERNAL_SERVER_ERROR);
        } else if (xmlOutput.equals("Generated XML is not valid against the schema.")) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.BAD_REQUEST);
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(org.springframework.http.MediaType.APPLICATION_XML);
            headers.setContentDispositionFormData("attachment", "declarants.xml");
            return new ResponseEntity<>(xmlOutput, headers, HttpStatus.OK);
        }
    }
}

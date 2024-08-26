package com.example.demo.controller;

import com.example.demo.service.XMLGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class XMLController {

    @Autowired
    private XMLGeneratorService xmlGeneratorService;

    @GetMapping("/generate-xml")
    public ResponseEntity<String> generateXML(
            @RequestParam(value = "mois", required = false) String mois,
            @RequestParam(value = "annee", required = false) String annee) {

        // Utiliser des valeurs par défaut si les paramètres ne sont pas fournis
        if (mois == null || mois.isEmpty()) {
            mois = "01"; // Par exemple, mois par défaut
        }
        if (annee == null || annee.isEmpty()) {
            annee = "2024"; // Par exemple, année par défaut
        }

        // Appel du service pour générer le XML en fonction des paramètres
        String xmlOutput = xmlGeneratorService.generateXML(mois, annee);
        return handleResponse(xmlOutput);
    }

    private ResponseEntity<String> handleResponse(String xmlOutput) {
        if ("Error generating XML".equals(xmlOutput)) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.INTERNAL_SERVER_ERROR);
        } else if ("Generated XML is not valid against the schema.".equals(xmlOutput)) {
            return new ResponseEntity<>(xmlOutput, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(org.springframework.http.MediaType.APPLICATION_XML);
            headers.setContentDispositionFormData("attachment", "declarants.xml");
            return new ResponseEntity<>(xmlOutput, headers, HttpStatus.OK);
        }
    }
}

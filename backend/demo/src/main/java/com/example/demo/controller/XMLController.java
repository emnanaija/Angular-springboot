package com.example.demo.controller;

import com.example.demo.entity.Retenue_four;
import com.example.demo.dao.RetenuFourRepository;
import com.example.demo.service.XMLGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class XMLController {

    @Autowired
    private RetenuFourRepository retenueFourRepository;

    @Autowired
    private XMLGeneratorService xmlGeneratorService;

    @GetMapping("/generate-xml")
    public ResponseEntity<String> generateXML() {
        List<Retenue_four> retenueFours = retenueFourRepository.findAll();
        if (retenueFours.isEmpty()) {
            return new ResponseEntity<>("No records found!", HttpStatus.OK);
        }
        String xmlOutput = xmlGeneratorService.generateXML(retenueFours);
        if (xmlOutput != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(org.springframework.http.MediaType.APPLICATION_XML);
            headers.setContentDispositionFormData("attachment", "declarants.xml");
            return new ResponseEntity<>(xmlOutput, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error generating XML", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

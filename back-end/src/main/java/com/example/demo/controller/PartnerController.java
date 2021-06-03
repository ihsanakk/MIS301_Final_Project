package com.example.demo.controller;


import com.example.demo.entity.Partner;
import com.example.demo.service.PartnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class PartnerController {


    private PartnersService partnersService;

    @Autowired
    public PartnerController(PartnersService partnersService) {
        this.partnersService = partnersService;
    }

    @GetMapping("/getPartners")
    public ResponseEntity<List<Partner>> getPartnersList(){
        return ResponseEntity.ok().body(partnersService.getPartnersList());
    }
}

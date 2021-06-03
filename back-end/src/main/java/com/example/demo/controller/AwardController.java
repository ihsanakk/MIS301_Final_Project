package com.example.demo.controller;


import com.example.demo.entity.Award;
import com.example.demo.service.AwardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class AwardController {

    private AwardsService awardsService;

    @Autowired
    public AwardController(AwardsService awardsService) {
        this.awardsService = awardsService;
    }

    @GetMapping("/getCompanyAwards")
    public ResponseEntity<List<Award>> getAwardsList(){
        return ResponseEntity.ok().body(awardsService.getAwardsList());
    }
}

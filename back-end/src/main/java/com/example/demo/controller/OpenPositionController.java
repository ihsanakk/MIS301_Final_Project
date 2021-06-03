package com.example.demo.controller;


import com.example.demo.entity.OpenPosition;
import com.example.demo.service.OpenPositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class OpenPositionController {

    private OpenPositionsService openPositionsService;

    @Autowired
    public OpenPositionController(OpenPositionsService openPositionsService) {
        this.openPositionsService = openPositionsService;
    }

    @GetMapping("/openPositions")
    public ResponseEntity<List<OpenPosition>> getOpenPositions(){

        return ResponseEntity.ok().body(openPositionsService.getOpenPositionsList());
    }
}

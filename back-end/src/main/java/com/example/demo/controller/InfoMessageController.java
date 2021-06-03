package com.example.demo.controller;


import com.example.demo.entity.InfoMessage;
import com.example.demo.service.InfoMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
public class InfoMessageController {

    private InfoMessageService infoMessageService;

    @Autowired
    public InfoMessageController(InfoMessageService infoMessageService) {
        this.infoMessageService = infoMessageService;
    }

    @PostMapping("/postInfo")
    public ResponseEntity<InfoMessage> postInfo(@RequestBody InfoMessage infoMessage){
        return ResponseEntity.ok().body(infoMessageService.postInfo(infoMessage));
    }


}

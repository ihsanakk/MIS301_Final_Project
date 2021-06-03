package com.example.demo.service.impl;

import com.example.demo.entity.InfoMessage;
import com.example.demo.repo.InfoMessageRepo;
import com.example.demo.service.InfoMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoMessageServiceImpl implements InfoMessageService {

    private InfoMessageRepo infoMessageRepo;

    @Autowired
    public InfoMessageServiceImpl(InfoMessageRepo infoMessageRepo) {
        this.infoMessageRepo = infoMessageRepo;
    }

    @Override
    public InfoMessage postInfo(InfoMessage infoMessage) {
        infoMessageRepo.save(infoMessage);
        return infoMessage;
    }
}

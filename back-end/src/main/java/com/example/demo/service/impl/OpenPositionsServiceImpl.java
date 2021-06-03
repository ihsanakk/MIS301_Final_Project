package com.example.demo.service.impl;


import com.example.demo.entity.OpenPosition;
import com.example.demo.repo.OpenPositionsRepo;
import com.example.demo.service.OpenPositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenPositionsServiceImpl implements OpenPositionsService {

    private OpenPositionsRepo openPositionsRepo;

    @Autowired
    public OpenPositionsServiceImpl(OpenPositionsRepo openPositionsRepo) {
        this.openPositionsRepo = openPositionsRepo;
    }

    @Override
    public List<OpenPosition> getOpenPositionsList() {
        return openPositionsRepo.findAll();
    }
}

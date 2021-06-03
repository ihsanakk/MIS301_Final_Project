package com.example.demo.service.impl;

import com.example.demo.entity.Award;
import com.example.demo.repo.AwardsRepo;
import com.example.demo.service.AwardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardsServiceImpl implements AwardsService {

    private AwardsRepo awardsRepo;

    @Autowired
    public AwardsServiceImpl(AwardsRepo awardsRepo) {
        this.awardsRepo = awardsRepo;
    }

    @Override
    public List<Award> getAwardsList() {
        return awardsRepo.findAll();
    }
}

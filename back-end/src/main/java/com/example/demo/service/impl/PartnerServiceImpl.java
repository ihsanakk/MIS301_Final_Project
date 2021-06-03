package com.example.demo.service.impl;

import com.example.demo.entity.Partner;
import com.example.demo.repo.PartnersRepo;
import com.example.demo.service.PartnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerServiceImpl implements PartnersService {

    private PartnersRepo partnersRepo;

    @Autowired
    public PartnerServiceImpl(PartnersRepo partnersRepo) {
        this.partnersRepo = partnersRepo;
    }

    @Override
    public List<Partner> getPartnersList() {
        return partnersRepo.findAll();
    }
}

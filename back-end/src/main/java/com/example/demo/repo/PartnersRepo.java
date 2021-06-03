package com.example.demo.repo;

import com.example.demo.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnersRepo extends JpaRepository<Partner,Integer> {
}

package com.example.demo.repo;

import com.example.demo.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardsRepo extends JpaRepository<Award,Integer> {
}

package com.example.demo.repo;

import com.example.demo.entity.OpenPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpenPositionsRepo extends JpaRepository<OpenPosition,Integer> {
}

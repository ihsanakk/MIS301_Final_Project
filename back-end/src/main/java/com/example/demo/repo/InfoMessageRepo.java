package com.example.demo.repo;

import com.example.demo.entity.InfoMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoMessageRepo extends JpaRepository<InfoMessage,Integer> {
}

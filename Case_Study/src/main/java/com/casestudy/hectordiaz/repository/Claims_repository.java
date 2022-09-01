package com.casestudy.hectordiaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.hectordiaz.model.Claims_model;

@Repository
public interface Claims_repository extends JpaRepository<Claims_model, Long>{

}

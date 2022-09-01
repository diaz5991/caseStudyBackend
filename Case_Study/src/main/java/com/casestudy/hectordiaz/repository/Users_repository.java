package com.casestudy.hectordiaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.hectordiaz.model.Users_model;

@Repository
public interface Users_repository extends JpaRepository<Users_model, Long>{

}

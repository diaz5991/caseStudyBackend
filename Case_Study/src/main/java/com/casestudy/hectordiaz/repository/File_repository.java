package com.casestudy.hectordiaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.hectordiaz.model.File_model;

@Repository
public interface File_repository extends JpaRepository<File_model, Long>{
	
	

}

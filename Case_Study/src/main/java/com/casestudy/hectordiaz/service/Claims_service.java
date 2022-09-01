package com.casestudy.hectordiaz.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.hectordiaz.model.Claims_model;
import com.casestudy.hectordiaz.model.Claims_modelResponse;
import com.casestudy.hectordiaz.repository.Claims_repository;

@Service
public class Claims_service {

	@Autowired
	Claims_repository claims_repository;
	Claims_modelResponse claims_response;

	public ArrayList<Claims_model> getClaims() {

		return (ArrayList<Claims_model>) claims_repository.findAll();
	}

	public Claims_model addClaim(Claims_model claim) {

		return claims_repository.save(claim);
	}

	public String deleteClaim(Long id) {

		claims_repository.deleteById(id);

		return "The claim has been Deleted";

	}

	public Claims_model updateClaim(Claims_model claimUpdate) {

		//new Claims_modelResponse(claims_repository.findById(id));

		return claims_repository.save(claimUpdate);

	}
	
	public Optional<Claims_model> getClaimById(Long id) {
		
		return claims_repository.findById(id);
	}

}

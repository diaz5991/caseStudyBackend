package com.casestudy.hectordiaz.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.hectordiaz.model.Claims_model;
import com.casestudy.hectordiaz.service.Claims_service;

@CrossOrigin(origins = "http://localhost:14497/")
@RestController
@RequestMapping("claims")
public class Claims_controller {

	@Autowired
	Claims_service claims_service;

	@GetMapping("getClaims")
	public ArrayList<Claims_model> getClaims() {

		return claims_service.getClaims();
	}

	@PostMapping("addClaims")
	public Claims_model addClaims(@RequestBody Claims_model claim) {

		return claims_service.addClaim(claim);
	}

	@DeleteMapping("deleteClaims/{id}")
	public String deleteClaim(@PathVariable Long id) {

		return claims_service.deleteClaim(id);
	}

	
	@GetMapping("getClaimById/{id}")
	public Optional<Claims_model> getClaimById(@PathVariable Long id) {
		
		return claims_service.getClaimById(id);
	}
	
	@PutMapping("updateClaims/{id}")
	public Claims_model updateClaim(@RequestBody Claims_model claimUpdate) {
		return claims_service.updateClaim(claimUpdate);
	}

}
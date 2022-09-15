package com.casestudy.hectordiaz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.hectordiaz.model.AuthenticationBean;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3761/")
public class BasicAuthentication_controller {
	
	@GetMapping("basicAuth")
	public 	AuthenticationBean bean() {
		
		return new AuthenticationBean("You are athenticated");
	}

}

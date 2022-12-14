package com.casestudy.hectordiaz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.hectordiaz.model.Users_model;
import com.casestudy.hectordiaz.service.Users_service;

@CrossOrigin(origins = "http://localhost:3761/")
@RestController
@RequestMapping("login")
public class Login_controller {

	@Autowired
	Users_service users_service;

	@PostMapping("newUser")
	public Users_model createNewUser(@RequestBody Users_model user) {

		return users_service.createNewUser(user);
	}

	@GetMapping("getUsers")
	public ArrayList<Users_model> getUsers() {
		return users_service.getAllUsers();

	}

	@DeleteMapping("deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {

		users_service.deleteUser(id);

		return "El Usuario ha sido eliminado con exito";
	}
}

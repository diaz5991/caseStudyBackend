package com.casestudy.hectordiaz.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.hectordiaz.model.Users_model;
import com.casestudy.hectordiaz.repository.Users_repository;

@Service
public class Users_service {

	@Autowired
	Users_repository users_repository;	
	

	

	public ArrayList<Users_model> getAllUsers() {
		return (ArrayList<Users_model>) users_repository.findAll();
	}

	public Users_model createNewUser(Users_model newUser) {

		return users_repository.save(newUser);
	}

	public String deleteUser(Long id) {

		users_repository.deleteById(id);

		return "El Usuario ha sido eliminado";
	}

	public Users_model updateUser(Users_model user) {

		return users_repository.save(user);
	}

}

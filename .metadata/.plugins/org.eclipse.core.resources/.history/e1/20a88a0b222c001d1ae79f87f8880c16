package com.casestudy.hectordiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users_Table")
public class Users_model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable= true, unique=true)
	private Long id;
	
	private String name;
	@Column(unique=true)
	private String password;
	@Column(unique=true)
	private String email;
	private String accessLevel; //user or admin
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	
	@Override
	public String toString() {
		return "Users_model [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", accessLevel=" + accessLevel + "]";
	}
	
	
	
	

}

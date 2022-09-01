package com.casestudy.hectordiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Claims_Table")
public class Claims_model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private Long id;
	
	private String description;
	private boolean status;
	private String model;
	private String color;
	private String plates;
	private String userClaim;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}

	public String getUserClaim() {
		return userClaim;
	}

	public void setUserClaim(String userClaim) {
		this.userClaim = userClaim;
	}

	@Override
	public String toString() {
		return "Claims_model [id=" + id + ", description=" + description + ", status=" + status + ", model=" + model
				+ ", color=" + color + ", plates=" + plates + "]";
	}

}

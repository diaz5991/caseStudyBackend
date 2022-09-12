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
	private String status;
	private String model;
	private String plates;
	private String userClaim;
	// @Lob
	// private byte[] file;

	public Claims_model() {
		super();
	}

	public Claims_model(String description, String status, String model, String plates) {
		super();
		this.description = description;
		this.status = status;
		this.model = model;
		this.plates = plates;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
				+ ", plates=" + plates + "]";
	}

	/*
	 * public byte[] getFile() { return file; }
	 * 
	 * public void setFile(byte[] file) { this.file = file; }
	 */

}

package com.casestudy.hectordiaz.model;

public class Claims_modelResponse {

	private Long id;
	private String description;
	private boolean status;
	private String model;
	private String color;
	private String plates;
	private String userClaim;
	
	public Claims_modelResponse() {}

	public Claims_modelResponse(Claims_model claims) {

		this.id = claims.getId();
		this.description = claims.getDescription();
		this.status = claims.isStatus();
		this.model = claims.getModel();
		this.color = claims.getColor();
		this.plates = claims.getPlates();
		this.userClaim = claims.getUserClaim();
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

}

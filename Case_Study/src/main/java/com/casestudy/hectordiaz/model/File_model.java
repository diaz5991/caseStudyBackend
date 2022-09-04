package com.casestudy.hectordiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Case_File")
public class File_model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = true, unique = true)
	private String name;
	private String type;
	@Lob
	private byte[] file;
	
	public File_model() {
		
	}
	public File_model(String name, String type, byte[] file) {
		
		this.name = name;
		this.type = type;
		this.file = file;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	
	
	
	

}

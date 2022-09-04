package com.casestudy.hectordiaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.hectordiaz.model.File_model;
import com.casestudy.hectordiaz.repository.File_repository;

@Service
public class File_service {

	@Autowired
	File_repository file_repository;

	

	public void addFile(File_model file) {
		
		file_repository.save(file);
/*
		File_model fileModel = new File_model();

		try {
			fileModel.setFile(file.getBytes());
			fileModel.setName(file.getOriginalFilename());
			fileModel.setType(file.getContentType());
			file_repository.save(fileModel);

			System.out.println(fileModel.getName() + fileModel.getFile() + fileModel.getType());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	public File_model viewFile(Long id) {
		
		return file_repository.getOne(id);
	}

}
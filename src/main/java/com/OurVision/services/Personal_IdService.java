package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.Personal_Id;
import com.OurVision.repositories.Personal_IdRepository;

@Service
public class Personal_IdService {
	@Autowired
	private Personal_IdRepository newRepo;
	public Personal_Id create(Personal_Id personalid) {
		return this.newRepo.save(personalid);
	}
	
	public Personal_Id findById(Long id) {
		return this.newRepo.findById(id).orElse(null);
	}
}

package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.NewId;
import com.OurVision.repositories.NewIdRepository;

@Service
public class New_IdService {

	@Autowired
	private NewIdRepository newRepo;
	public NewId create(NewId newid) {
		return this.newRepo.save(newid);
	}
	
	public NewId findById(Long id) {
		return this.newRepo.findById(id).orElse(null);
	}
}

package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.NewPassport;
import com.OurVision.repositories.NewPassRepository;
@Service

public class NewPassService {
	
	@Autowired
	private NewPassRepository newRepo;
	
	public NewPassport create(NewPassport newpassport) {
		return this.newRepo.save(newpassport);
	}
	
	public NewPassport findById(Long id) {
		return this.newRepo.findById(id).orElse(null);
	}
}

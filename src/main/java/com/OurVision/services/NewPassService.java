package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.NewPassport;
import com.OurVision.repositories.AddressRepository;
import com.OurVision.repositories.AttachRepository;
import com.OurVision.repositories.NewPassRepository;
@Service

public class NewPassService {
	
	@Autowired
	private NewPassRepository newRepo;
	@Autowired
	private AddressRepository aRepo;
	@Autowired
	private AttachRepository attRepo;
	
	public NewPassport create(NewPassport newpassport) {
		return this.newRepo.save(newpassport);
	}
}

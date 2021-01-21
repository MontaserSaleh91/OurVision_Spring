package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.Address;
import com.OurVision.repositories.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository aRepo;

	
	public Address create(Address userAddress) {
		return this.aRepo.save(userAddress);
	}
	
}

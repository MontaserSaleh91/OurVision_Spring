package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OurVision.models.Certificate;
import com.OurVision.repositories.CertificateRepository;

@Service
public class CertificateService {

	@Autowired
	private CertificateRepository newRepo;
	
	public Certificate create(Certificate certificate) {
		return this.newRepo.save(certificate);
	}
	
	public Certificate findById(Long id) {
		return this.newRepo.findById(id).orElse(null);
	}
}

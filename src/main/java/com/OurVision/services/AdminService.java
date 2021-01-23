//package com.OurVision.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.OurVision.models.Admin;
//import com.OurVision.repositories.AdminRepository;
//
//@Service
//public class AdminService {
//	@Autowired
//	private AdminRepository newRepo;
//	public Admin create(Admin admin) {
//		return this.newRepo.save(admin);
//	}
//	
//	public Admin findById(Long id) {
//		return this.newRepo.findById(id).orElse(null);
//	}
//}

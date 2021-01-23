package com.OurVision.services;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.OurVision.models.NewPassport;
import com.OurVision.repositories.NewPassRepository;
@Service

public class NewPassService {
	
	@Autowired
	private NewPassRepository newRepo;
	
//	public NewPassport create(NewPassport newpassport) {
//		return this.newRepo.save(newpassport);
//	}
	
	public NewPassport findById(Long id) {
		return this.newRepo.findById(id).orElse(null);
	}
	
//	public void  create(MultipartFile file , MultipartFile img,String full_name,String id_number
//			,Date date_of_birth , String place_of_birth, String sex, String profission)
//	{
//		NewPassport p = new NewPassport();
//		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//		String imgName = StringUtils.cleanPath(file.getOriginalFilename());
//		if(fileName.contains(".."))
//		{
//			System.out.println("not a a valid file");
//		}
//		try {
//			p.setId_image(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		if(imgName.contains(".."))
//		{
//			System.out.println("not a a valid file");
//		}
//		try {
//			p.setPersonal_image(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		p.setId_number(id_number);
//		
//        p.setFull_name(full_name);
//        p.setDate_of_birth(date_of_birth);
//        p.setPlace_of_birth(place_of_birth);
//        p.setProfission(profission);
//        p.setSex(sex);
//        
//        newRepo.save(p);
//	}
}

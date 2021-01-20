package com.OurVision.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.OurVision.models.ModifyPassport;
import com.OurVision.repositories.AddressRepository;
import com.OurVision.repositories.ModifyPassRepository;

public class ModifyPassService {
	@Autowired
	private ModifyPassRepository modifyRepo;
	@Autowired
	private AddressRepository aRepo;

	
	public ModifyPassport create(ModifyPassport modifypassport) {
		return this.modifyRepo.save(modifypassport);
	}
	
//	public Attach store(MultipartFile file) throws IOException {
//	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//	    FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
//
//	    return fileDBRepository.save(FileDB);
//	  }
//
//	  public FileDB getFile(String id) {
//	    return fileDBRepository.findById(id).get();
//	  }
//	  
//	  public Stream<FileDB> getAllFiles() {
//	    return fileDBRepository.findAll().stream();
//	  }

}

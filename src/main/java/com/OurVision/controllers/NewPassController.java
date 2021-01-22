package com.OurVision.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.OurVision.models.NewPassport;
import com.OurVision.models.User;
import com.OurVision.services.UserService;

@Controller
public class NewPassController {
	@Autowired
	private UserService userService;
	
	public Long userSessionId(HttpSession session) {
		if(session.getAttribute("userId") == null)
			return null;
		return (Long)session.getAttribute("userId");
	}
	
	@GetMapping("/newpassword")
    public String newPass(@ModelAttribute("newPass") NewPassport newPass,Model model, BindingResult result, HttpSession session)
    {
		Long userId = this.userSessionId(session);
		if(userId == null)
			return "redirect:/login";
		User user = this.userService.findById(userId);
		model.addAttribute("user", user);
    	
    	return "passport.jsp";
    }
	
//	@PostMapping(value = "/newpass")
//    public String createnewPass(@Valid  HttpSession session, @RequestParam("file") MultipartFile file, @RequestParam("img") MultipartFile img, @RequestParam("full_name") String full_name, @RequestParam("id_number") String id_number, @RequestParam("date_of_birth") Date date_of_birth, @RequestParam("place_of_birth") String place_of_birth, @RequestParam("sex") String sex, @RequestParam("profission") String profission)
//    {
//		
//		Long userId = this.userSessionId(session);
//		if(userId == null)
//			return "redirect:/login";
//
//			
//    	this.npService.create(file, img, full_name,id_number, date_of_birth, place_of_birth, sex, profission);
//    	return "redirect:/";
//    }
	
	
	
	

}

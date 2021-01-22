package com.OurVision.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.OurVision.models.Address;
import com.OurVision.models.User;
import com.OurVision.services.AddressService;
import com.OurVision.services.UserService;

@Controller
public class AddressController {
	private final UserService userService;
	private final AddressService adService;
	
	public AddressController(AddressService adService, UserService userService) {
		this.adService = adService;
		this.userService = userService;
	}
	
	@RequestMapping("/address")
	public String address(@ModelAttribute("address") Address address,Model model, HttpSession session, RedirectAttributes flash) {
		
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			flash.addFlashAttribute("error", "You must be logged in ");
			return "redirect:/";
		}
		User u = userService.findById(userId);
		model.addAttribute("user", u);
		return "address.jsp";
	}
	
	@PostMapping("/address")
	public void createAddress(@Valid @ModelAttribute("address") Address address, BindingResult result, HttpSession session, RedirectAttributes flash) {
		

			adService.create(address);
		
		
	}
	
	
}

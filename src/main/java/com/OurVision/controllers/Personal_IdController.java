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

import com.OurVision.models.Personal_Id;
import com.OurVision.models.User;
import com.OurVision.services.Personal_IdService;
import com.OurVision.services.UserService;

@Controller
public class Personal_IdController {
	private final UserService userService;
	private final Personal_IdService adService;
	
	public Personal_IdController(Personal_IdService adService, UserService userService) {
		this.adService = adService;
		this.userService = userService;
	}
	@RequestMapping("/personal_id")
	public String personal_id(@ModelAttribute("personal_id") Personal_Id personal_id,Model model, HttpSession session, RedirectAttributes flash) {
		
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			flash.addFlashAttribute("error", "You must be logged in ");
			return "redirect:/";
		}
		User u = userService.findById(userId);
		model.addAttribute("user", u);
		return "personal.jsp";
	}
	
	@PostMapping("/personal_id")
	public String createPersonal_Id(@Valid @ModelAttribute("personal_id") Personal_Id personal_id, BindingResult result, HttpSession session, RedirectAttributes flash) {
		
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			flash.addFlashAttribute("error", "You must be logged in");
			return "redirect:/";
		}
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			adService.create(personal_id);
			return String.format("redirect:/");
		}
		
	}
}

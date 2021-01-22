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

import com.OurVision.models.NewId;
import com.OurVision.models.User;
import com.OurVision.services.New_IdService;
import com.OurVision.services.UserService;

@Controller
public class NewIdController {
		private final UserService userService;
		private final New_IdService adService;
		
		public NewIdController(New_IdService adService, UserService userService) {
			this.adService = adService;
			this.userService = userService;
		}
		@RequestMapping("/newid")
		public String newid(@ModelAttribute("newid") NewId newid,Model model, HttpSession session, RedirectAttributes flash) {
			
			Long userId = (Long) session.getAttribute("userId");
			if(userId == null) {
				flash.addFlashAttribute("error", "You must be logged in ");
				return "redirect:/";
			}
			User u = userService.findById(userId);
			model.addAttribute("user", u);
			return "newid.jsp";
		}
		
		@PostMapping("/newid")
		public String createNewId(@Valid @ModelAttribute("newid") NewId newid, BindingResult result, HttpSession session, RedirectAttributes flash) {
			
			Long userId = (Long) session.getAttribute("userId");
			if(userId == null) {
				flash.addFlashAttribute("error", "You must be logged in");
				return "redirect:/";
			}
			if(result.hasErrors()) {
				return "new.jsp";
			} else {
				adService.create(newid);
				return String.format("redirect:/");
			}
			
		}
}
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

import com.OurVision.models.Certificate;
import com.OurVision.models.User;
import com.OurVision.services.CertificateService;
import com.OurVision.services.UserService;

@Controller
public class CertificateController {
		private final UserService userService;
		private final CertificateService adService;
		
		public CertificateController(CertificateService adService, UserService userService) {
			this.adService = adService;
			this.userService = userService;
		}
		@RequestMapping("/certificate")
		public String certificate(@ModelAttribute("certificate") Certificate certificate,Model model, HttpSession session, RedirectAttributes flash) {
			
			Long userId = (Long) session.getAttribute("userId");
			if(userId == null) {
				flash.addFlashAttribute("error", "You must be logged in ");
				return "redirect:/";
			}
			User u = userService.findById(userId);
			model.addAttribute("user", u);
			return "certificate.jsp";
		}
		@PostMapping("/certificate")
		public String createCertificate(@Valid @ModelAttribute("certificate") Certificate certificate, BindingResult result, HttpSession session, RedirectAttributes flash) {
			
			Long userId = (Long) session.getAttribute("userId");
			if(userId == null) {
				flash.addFlashAttribute("error", "You must be logged in");
				return "redirect:/";
			}
			if(result.hasErrors()) {
				return "certificate.jsp";
			} else {
				adService.create(certificate);
				return String.format("redirect:/");
			}
	}
}

//package com.OurVision.controllers;
//
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.OurVision.models.Admin;
//import com.OurVision.models.User;
//import com.OurVision.services.AdminService;
//import com.OurVision.services.UserService;
//
//@Controller
//public class AdminController {
//	private final UserService userService;
//	private final AdminService adService;
//	
//	public AdminController(AdminService adService, AdminService adminService) {
//		this.adService = adService;
//		this.userService = userService;
//	}
//	
//	@RequestMapping("/admin")
//	public String admin(@ModelAttribute("admin") Admin admin,Model model, HttpSession session, RedirectAttributes flash) {
//		
//		Long userId = (Long) session.getAttribute("userId");
//		if(userId == null) {
//			flash.addFlashAttribute("error", "You must be logged in ");
//			return "redirect:/";
//		}
//		User u = userService.findById(userId);
//		model.addAttribute("user", u);
//		return "admin.jsp";
//	}
//	
//	@PostMapping("/admin")
//	public String createAdmin(@Valid @ModelAttribute("admin") Admin admin, BindingResult result, HttpSession session, RedirectAttributes flash) {
//		
//		Long userId = (Long) session.getAttribute("userId");
//		if(userId == null) {
//			flash.addFlashAttribute("error", "You must be logged in");
//			return "redirect:/";
//		}
//		if(result.hasErrors()) {
//			return "admin.jsp";
//		} else {
//			adService.create(admin);
//			return String.format("redirect:/");
//		}
//	}
//	@RequestMapping("/admin")
//	public String newShow(Model model, @ModelAttribute("show") Admin admin, HttpSession session, RedirectAttributes flash) {
//		Long userId = (Long) session.getAttribute("userId");
//		if(userId == null) {
//			flash.addFlashAttribute("error", "You must be logged in ");
//			return "redirect:/";
//		}
//		User u = userService.findById(userId);
//		model.addAttribute("user", u);
//		return "admin.jsp";
//	}
//	
//	@RequestMapping("/shows/{id}")
//	public String showShow(Model model, @PathVariable("id") Long id, HttpSession session, RedirectAttributes flash, @Valid @ModelAttribute("review") Review review, BindingResult result) {
//		Long userId = (Long) session.getAttribute("userId");
//		if(userId == null) {
//			flash.addFlashAttribute("error", "You must be logged in");
//			return "redirect:/";
//		}
//		model.addAttribute("show", AdminService.findById(id));
//		User u = userService.findById(userId);
//		model.addAttribute("user", u);
//		return "admin.jsp";
//	}
//	
//}
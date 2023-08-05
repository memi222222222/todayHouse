package com.today.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	@RequestMapping("/category")
	public String join() {
		return "categories";
	}
	@RequestMapping("/details")
	public String details() {
		return "contest-details";
	}

	@RequestMapping("/contests")
	public String contests() {
		return "contests";
	}
	
	@RequestMapping("/users")
	public String users() {
		return "users";
	}
	
	
	@GetMapping("/user_login_form")
	public String user_login_form() {
		
		return "";
	}

	
	
	
	


}

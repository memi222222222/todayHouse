package com.today.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.today.house.command.UserVO;
import com.today.house.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {


	@Autowired
	@Qualifier("userService")
	private UserService userService;

	//로그인
	@GetMapping("/user_login_form")  
	public String cp_login_form(UserVO vo, Model model) {
		model.addAttribute("login_info" ,userService.user_login(vo));
		return "redirect:/";
	}


	//회원가입
	@GetMapping("/user_regist_form")
	public String user_regist_form (UserVO vo, RedirectAttributes ra) {
		int result = userService.user_regist_form(vo);
		if(result == 1) {
			ra.addFlashAttribute("msg", "회원가입에 성공하였습니다.");
		} else {
			ra.addFlashAttribute("msg", "회원가입에 실패하였습니다.");
		}
		return "redirect:/";
	}
}

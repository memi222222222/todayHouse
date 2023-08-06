package com.today.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.today.house.command.CpVO;
import com.today.house.service.CpService;

@Controller
@RequestMapping("/cp")
public class CpController {

	@Autowired
	@Qualifier("cpService")
	private CpService cpSercvice;
	
	
	@PostMapping("cp_login_form")
	public String cp_login_form(CpVO vo, Model model) {
		
		model.addAttribute("login_info", cpSercvice.cp_login_form(vo));
		return "redirect:/";
	}
	
   @GetMapping("/cp_regist_form")
   public String cp_regist_form(CpVO vo, RedirectAttributes ra) {
      int result = cpSercvice.cp_regist_form(vo);
      if(result == 1) {
         ra.addFlashAttribute("msg", "회원가입에 성공하였습니다.");
      } else {
         ra.addFlashAttribute("msg", "회원가입에 실패하였습니다");
      }
      return "redirect:/";
   }
	
   @GetMapping("/cp_list")
   public String cp_list() {
      return "/company/company-list";
   }
	
	

   
   
   
   
   
   
   
   
   
   
   
   
}

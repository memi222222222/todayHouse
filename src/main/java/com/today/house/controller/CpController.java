package com.today.house.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.today.house.command.CpExVO;
import com.today.house.command.CpVO;
import com.today.house.cp.service.CpService;
import com.today.house.util.CpCriteria;
import com.today.house.util.CpPageVO;

@Controller
@RequestMapping("/company")
public class CpController {

	@Autowired
	@Qualifier("cpService")
	private CpService cpSercvice;



	//시공사 리스트
	@GetMapping("/cp_list")
	public String cp_list(@RequestParam("cp_major") String cp_major,
			Model model, CpCriteria cri) {
		ArrayList<CpVO> list = cpSercvice.cp_getList(cp_major, cri);
		CpPageVO cpPageVO = new CpPageVO(cri, cpSercvice.getTotal(cp_major, cri));
		model.addAttribute("cp_major", cp_major);
		model.addAttribute("list", list);
		model.addAttribute("cpPageVO", cpPageVO);
		return "company/company-list";
	}

	//시공사 상세정보
	@GetMapping("/cp_content_info")
	public String cp_content_info(@RequestParam("cp_id") String cp_id, Model model) {
		model.addAttribute("vo", cpSercvice.cp_getdetail(cp_id));
		return "company/company-content-info";
	}

	//시공사 사례 리스트
	@GetMapping("/cp_content_ex")
	public String cp_content_ex(@RequestParam("cp_id") String cp_id, Model model) {
		model.addAttribute("vo", cpSercvice.cp_getdetail(cp_id));
		model.addAttribute("exlist", cpSercvice.cp_getExdetail(cp_id));
		return "company/company-content-ex";
	}

	//시공사 사례 상세
	@GetMapping("/cp_content_ex_detail")
	public String cp_content_ex_detail(CpExVO vo, Model model) {
		model.addAttribute("vo", cpSercvice.cp_content_ex_detail(vo));
		return "company/company-content-ex-detail";
	}

	//사용자 상담신청
	@GetMapping("user_consultant_regist")
	public String user_consultant_regist (@RequestParam("user_id") String user_id,
			@RequestParam("cp_id") String cp_id,
			Model model) {
		model.addAttribute("user_id", user_id);
		model.addAttribute("cp_id", cp_id);
		return "user-consultant-regist";
	}

}

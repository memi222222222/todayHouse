package com.today.house.service;

import com.today.house.command.CpVO;

public interface CpService {
	
	//로그인
	public CpVO cp_login_form(CpVO vo);
	
	public int cp_regist_form(CpVO vo);
	
}

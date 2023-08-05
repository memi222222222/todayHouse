package com.today.house.service;

import com.today.house.command.UserVO;

public interface UserService {

	//로그인
	public UserVO user_login(UserVO vo);	
	
	//회원가입
	public int user_regist_form(UserVO vo);

	
	
	
}

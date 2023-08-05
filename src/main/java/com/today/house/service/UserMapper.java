package com.today.house.service;

import org.apache.ibatis.annotations.Mapper;

import com.today.house.command.UserVO;

@Mapper
public interface UserMapper {

	//로그인
	public UserVO user_login(UserVO vo);	
	
	
	//회원가입
	public int user_regist_form(UserVO vo);
	
	
}

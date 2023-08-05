package com.today.house.service;

import org.apache.ibatis.annotations.Mapper;

import com.today.house.command.CpVO;

@Mapper
public interface CpMapper {

	
	//로그인
	public CpVO cp_login_form(CpVO vo);

	public int cp_regist_form(CpVO vo);
}

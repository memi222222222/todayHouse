package com.today.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.house.command.CpVO;

@Service("cpService")
public class CpServiceImpl implements CpService {

	@Autowired
	private CpMapper cpMapper;	
	
	
	@Override
	public CpVO cp_login_form(CpVO vo) {
		return cpMapper.cp_login_form(vo);
	}

	   @Override
	   public int cp_regist_form(CpVO vo) {
	      return cpMapper.cp_regist_form(vo);
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

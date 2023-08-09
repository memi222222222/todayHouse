package com.today.house.cp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.house.command.CpExVO;
import com.today.house.command.CpVO;
import com.today.house.util.CpCriteria;

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

	@Override
	public ArrayList<CpVO> cp_getList(String cp_major, CpCriteria cri) {
		return cpMapper.cp_getList(cp_major, cri);
	}

	@Override
	public int getTotal(String cp_major, CpCriteria cri) {
		return cpMapper.getTotal(cp_major, cri);
	}

	@Override
	public CpVO cp_getdetail(String cp_id) {
		return cpMapper.cp_getdetail(cp_id);
	}

	@Override
	public ArrayList<CpExVO> cp_getExdetail(String cp_id) {
		return cpMapper.cp_getExdetail(cp_id);
	}

	@Override
	public int cp_content_ex_regist(CpExVO vo) {
		return cpMapper.cp_content_ex_regist(vo);
	}

	@Override
	public CpVO cp_mypage_check_form(CpVO vo) {
		return cpMapper.cp_mypage_check_form(vo);
	}

	@Override
	public int cp_mypage_change(CpVO vo) {
		return cpMapper.cp_mypage_change(vo);
	}

	@Override
	public CpExVO cp_content_ex_detail(CpExVO vo) {
		return cpMapper.cp_content_ex_detail(vo);
	}















}

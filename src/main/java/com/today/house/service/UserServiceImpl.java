package com.today.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.house.command.UserVO;


@Service("userService") 
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	//로그인
	@Override
	public UserVO user_login(UserVO vo) {
		return userMapper.user_login(vo);
	}
	
	//회원가입
	   @Override
	   public int user_regist_form(UserVO vo) {
	      return userMapper.user_regist_form(vo);
	   }
	
}

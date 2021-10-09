package com.withmountain.again18.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withmountain.again18.domain.LoginReqDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.mapper.UserMapper;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDTO login(LoginReqDTO loginReq) {
		
		
		try {
			UserDTO user = userMapper.selectUserByUserId(loginReq.getUserId());
			
			if (user!=null&&loginReq.getPasswd().equals(user.getPasswd())) {
				return user;
			} else {
				return null;
			}
				
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

}

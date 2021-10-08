package com.withmountain.again18.service;

import com.withmountain.again18.domain.LoginReqDTO;
import com.withmountain.again18.domain.UserDTO;

public interface LoginService {
	UserDTO login(LoginReqDTO loginReq);
	
}

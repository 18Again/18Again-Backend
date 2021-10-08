package com.withmountain.again18.service;

import com.withmountain.again18.domain.UserDTO;

public interface UserService {
	boolean registerUser(UserDTO newUser);
	UserDTO getUserByEmail(String email);
	int getUserCntByNickname(String nickname);
	int getUserCntByEmail(String email);
}

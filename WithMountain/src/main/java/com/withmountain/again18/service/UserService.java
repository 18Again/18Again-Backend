package com.withmountain.again18.service;

import com.withmountain.again18.domain.UserDTO;

public interface UserService {
	boolean registerUser(UserDTO newUser);
	UserDTO getUserByUserId(String userId);
	int getUserCntByNickname(String nickname);
	int getUserCntByUserId(String userId);
	int deleteUser(Long id);
}

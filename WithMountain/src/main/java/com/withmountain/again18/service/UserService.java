package com.withmountain.again18.service;

import com.withmountain.again18.domain.CreateUserDTO;
import com.withmountain.again18.domain.UserDTO;

public interface UserService {
	boolean registerUser(CreateUserDTO newUser);
	UserDTO getUserById(long id);
}

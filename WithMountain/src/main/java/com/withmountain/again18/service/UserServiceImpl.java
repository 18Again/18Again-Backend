package com.withmountain.again18.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withmountain.again18.domain.CreateUserDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean registerUser(CreateUserDTO newUser) {
		int result = 0;
		UserDTO user = new UserDTO();
		
		user.setNickname(newUser.getNickname());
		user.setEmail(newUser.getEmail());
		user.setPasswd(newUser.getPasswd());
		user.setGender(newUser.getGender());
		user.setAge(newUser.getAge());
		user.setImoji(newUser.getImoji());
		
		result = userMapper.insertUser(user);
		
		return (result==1)? true: false;
	}

	@Override
	public UserDTO getUserById(long id) {
		
		return userMapper.selectUser(id);
	}

}

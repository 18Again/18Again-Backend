package com.withmountain.again18.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean registerUser(UserDTO params) {
		int result = 0;
		UserDTO user = new UserDTO();
		
		if (params.getId()==null) {	//회원가입
			user.setNickname(params.getNickname());
			user.setEmail(params.getEmail());
			user.setPasswd(params.getPasswd());
			user.setGender(params.getGender());
			user.setAge(params.getAge());
			user.setImoji(params.getImoji());
			
			result = userMapper.insertUser(user);
		} else {	//등산 취향 조사
			user.setId(params.getId());
			user.setFriendship(params.getFriendship());
			user.setClimbingMate(params.getClimbingMate());
			user.setClimbingLevel(params.getClimbingLevel());
			user.setDifficulty(params.getDifficulty());
			user.setExercise(params.getExercise());
			user.setFrequency(params.getFrequency());
			
			result = userMapper.updateUserTaste(user);
		}
		
		
		return (result==1)? true: false;
	}

	@Override
	public UserDTO getUserById(long id) {
		
		return userMapper.selectUser(id);
	}

	@Override
	public UserDTO getUserByEmail(String email) {
	
		return userMapper.selectUserByEmail(email);
	}

	@Override
	public int getUserCntByNickname(String nickname) {
		
		return userMapper.getUserCntByNickname(nickname);
	}

	@Override
	public int getUserCntByEmail(String email) {
	
		return userMapper.getUserCntByEmail(email);
	}

}

package com.withmountain.again18.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.UserDTO;

@Mapper
public interface UserMapper {
	int insertUser(UserDTO newUser);
	UserDTO selectUser(Long id);
	UserDTO selectUserByUserId(String userId);
	int updateUserTaste(UserDTO user);
	int getUserCntByNickname(String nickname);
	int getUserCntByUserId(String userId);
	int deleteUser(Long id);
}

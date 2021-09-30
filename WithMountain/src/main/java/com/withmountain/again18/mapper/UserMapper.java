package com.withmountain.again18.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.UserDTO;

@Mapper
public interface UserMapper {
	int insertUser(UserDTO newUser);
	UserDTO selectUser(Long id);
	UserDTO selectUserByEmail(String email);

}

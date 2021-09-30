package com.withmountain.again18.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.UserDTO;

@Mapper
public interface UserMapper {
	public int insertUser(UserDTO newUser);
	public UserDTO selectUser(Long id);

}

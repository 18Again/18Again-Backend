package com.withmountain.again18.service;

import java.util.List;

import com.withmountain.again18.domain.BoardUserDTO;
import com.withmountain.again18.domain.UserDTO;

public interface BoardUserService {
	
	List<BoardUserDTO> getBoardUserList(UserDTO user);

}

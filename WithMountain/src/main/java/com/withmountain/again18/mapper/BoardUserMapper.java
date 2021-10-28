package com.withmountain.again18.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.BoardListResDTO;
import com.withmountain.again18.domain.BoardUserDTO;

@Mapper
public interface BoardUserMapper {
	List<BoardUserDTO> selectBoardJoinUser(int userId);
	List<BoardUserDTO> selectBoardListByUser(String userId);
	List<BoardUserDTO> selectBoardList(long id);
}

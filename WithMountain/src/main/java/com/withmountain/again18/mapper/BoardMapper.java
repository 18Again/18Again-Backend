package com.withmountain.again18.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.domain.BoardDetailDTO;

@Mapper
public interface BoardMapper {

	//public int insertBoard(BoardDTO params);
	//public BoardDTO selectBoardDetail(int id);
	public List<BoardDTO> selectBoardList();
	public int selectBoardTotalCount();
	//public int updateBoard(BoardDTO params);
	//public int deleteBoard(Long id);
	void insertBoard(BoardDTO board) throws Exception;
	int insertBoardReturnId();
	int updateBoard(BoardDTO board) throws Exception; 
	void deleteBoard(int boardId) throws Exception;
	//BoardDTO selectBoardDetail(int boardId);
	BoardDTO selectBoardId(int boardId);
	public List<BoardDetailDTO> selectBoardDetail(int boardId);
	
}

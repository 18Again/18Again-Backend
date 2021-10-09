package com.withmountain.again18.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.BoardDTO;

@Mapper
public interface BoardMapper {

	//public int insertBoard(BoardDTO params);
	//public BoardDTO selectBoardDetail(int id);
	BoardDTO selectBoardDetail(int boardId);
	public List<BoardDTO> selectBoardList();
	public int selectBoardTotalCount();
	//public int updateBoard(BoardDTO params);
	//public int deleteBoard(Long id);
	void insertBoard(BoardDTO board) throws Exception;
	void updateBoard(BoardDTO board) throws Exception; 
	void deleteBoard(int boardId) throws Exception;
	void updateBoardTest(int boardId);
}

package com.withmoutain.again18.service;

import java.util.List;

import com.withmountain.again18.domain.BoardDTO;

public interface BoardService {
	
	//public boolean registerBoard(BoardDTO params);
	//public BoardDTO getBoardDetail(int id);
	//List<BoardDTO> getBoardList();
	List<BoardDTO> selectBoardList() throws Exception;
	void insertBoard(BoardDTO board) throws Exception;
}

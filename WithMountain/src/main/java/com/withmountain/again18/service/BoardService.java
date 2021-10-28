
package com.withmountain.again18.service;

import java.util.List;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.domain.BoardDetailDTO;

public interface BoardService {
	
	//public boolean registerBoard(BoardDTO params);
	//public BoardDTO getBoardDetail(int id);
	//List<BoardDTO> getBoardList();
	List<BoardDTO> selectBoardList() ;
	void insertBoard(BoardDTO board) throws Exception;
	//BoardDTO selectBoardDetail(int boardId) throws Exception;
	void updateBoard(BoardDTO board) throws Exception;
	void deleteBoard(int boardId) throws Exception;
	List<BoardDetailDTO> selectBoardDetail(int boardId);
	int insertBoardReturnId();
}

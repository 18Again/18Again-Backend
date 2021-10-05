package com.withmoutain.again18.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	/*
	@Override
	public boolean registerBoard(BoardDTO params) {
		int queryResult=0;
		
		if(params.getId()==0) {//==null
			queryResult=boardMapper.insertBoard(params);
			}else {
				queryResult=boardMapper.updateBoard(params);
			}
		return (queryResult==1)?true:false;
	}
	
	@Override
	public BoardDTO getBoardDetail(int id) {
		return boardMapper.selectBoardDetail(id);
	}
	
	/*
	@Override
	public boolean deleteBoard(Long idx) {
		int queryResult=0;
		BoardDTO board=boardMapper.selectBoardDetail(idx);
		
		if(board!=null&&"N".equals(board.getDeleteYn())) {
			queryResult=boardMapper.deleteBoard(idx);
		}
		
		return(queryResult==1)?true:false;
	}
	*/
	
	/*
	@Override
	public List<BoardDTO> getBoardList() {
		
		List<BoardDTO> boardList=Collections.emptyList();
		int boardTotalCount=boardMapper.selectBoardTotalCount();
		
		if(boardTotalCount>0) {
			boardList=boardMapper.selectBoardList();
		}
		
		return boardList;
		
		
		
	}
	*/
	@Override
	public List<BoardDTO> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDTO board) throws Exception{
		boardMapper.insertBoard(board);
	}
	
	

}

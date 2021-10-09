
package com.withmountain.again18.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	*/
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
		9z
		if(boardTotalCount>0) {
			boardList=boardMapper.selectBoardList();
		}
		
		return boardList;
		
		
		
	}
	*/
	@Override
	public List<BoardDTO> selectBoardList(){
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDTO board) throws Exception{
		//System.out.println(board);
		//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd");
		//LocalDateTime date=LocalDateTime.parse(board.getClimbing_date(),formatter);
		LocalDate date = LocalDate.parse(board.getDate(), DateTimeFormatter.ofPattern("yyyyMMdd"));
		System.out.println(board);
		boardMapper.insertBoard(board);
		
		
	}
	
	@Override
	public BoardDTO selectBoardDetail(int boardId) throws Exception{
		BoardDTO board=boardMapper.selectBoardDetail(boardId);
		return board;
	}
	
	/*
	@Override
	public void updateBoard(int boardId) throws Exception{
		boardMapper.updateBoard(boardId);
	}
	
	@Override
	public void deleteBoard(BoardDTO board) throws Exception{
		boardMapper.deleteBoard(boardId);
	}
	*/
	@Override
	public void updateBoardTest(int boardId) throws Exception{
		boardMapper.updateBoardTest(boardId);
	}
	
	
	@Override
	public void updateBoard(BoardDTO board) throws Exception{
		boardMapper.updateBoard(board);
	}
	
	@Override 
	public void deleteBoard(int boardId) throws Exception{
		boardMapper.deleteBoard(boardId);
	}

}


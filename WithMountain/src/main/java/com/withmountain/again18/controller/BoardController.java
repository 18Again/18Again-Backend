
package com.withmountain.again18.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.service.BoardService;


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping(value="/board",method=RequestMethod.GET)
	public List<BoardDTO> openBoardList(){
		return boardService.selectBoardList();
	}
	
	
	@RequestMapping(value="/board/write",method=RequestMethod.POST)
	public void insertBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.insertBoard(board);
	}
	
	
	@RequestMapping(value="/board/{boardId}",method=RequestMethod.GET)
	public BoardDTO openBoardDetail(@PathVariable("boardId")int boardId) throws Exception{
		return boardService.selectBoardDetail(boardId);
		
	}
	
	/*
	@RequsetMapping(value="/board/{boardId}",method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.updateBoard(board);
		return
	}
	*/
	

}


package com.withmountain.again18.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.domain.BoardDetailDTO;
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
	public int insertBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.insertBoard(board);
		int userId;
		userId=board.getId();
		return userId;
	}
	
	
	@RequestMapping(value="/board/{boardId}",method=RequestMethod.POST)
	public List<BoardDetailDTO> openBoardDetail(@PathVariable("boardId")int boardId) throws Exception{
		System.out.println(boardService.selectBoardDetail(boardId));
		return boardService.selectBoardDetail(boardId);
		
	}
	
	
	@RequestMapping(value="/board/update/{boardId}",method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDTO board,@PathVariable("boardId") int boardId) throws Exception{
		//System.out.println(board.toString());
		board.setId(boardId);
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/board/{boardId}",method=RequestMethod.DELETE)
	@DeleteMapping(value="/board/{boardId}")
	public String deleteBoard(@PathVariable("boardId") int boardId) throws Exception{
		boardService.deleteBoard(boardId);
		return "redirect:/board";
	}
	
	
	

}

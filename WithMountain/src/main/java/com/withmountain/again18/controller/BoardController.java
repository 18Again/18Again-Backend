
package com.withmountain.again18.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.domain.BoardUserDTO;
import com.withmountain.again18.domain.RecommendResDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.service.BoardService;
import com.withmountain.again18.service.BoardUserService;
import com.withmountain.again18.util.SessionConstants;


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	@Autowired
	private BoardUserService boardUserService;
	
	
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
	
	@GetMapping(value="/board/recommend")
	ResponseEntity<List<RecommendResDTO>> getRecommendedBoardList(@SessionAttribute(name = SessionConstants.LOGIN_USER, required = false) UserDTO loginUser) {
		
		List<BoardUserDTO> boardUsers = boardUserService.getBoardUserList(loginUser);
		List<RecommendResDTO> recommendBoards = bindRecommendBoard(boardUsers);
		
		return ResponseEntity.ok(recommendBoards);
		
	}
	
	/*
	@RequsetMapping(value="/board/{boardId}",method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.updateBoard(board);
		return
	}
	*/
	
	private List<RecommendResDTO> bindRecommendBoard(List<BoardUserDTO> boardUsers) {
		List<RecommendResDTO> recommendBoards = new ArrayList<RecommendResDTO>();
		
		for (BoardUserDTO boardUser: boardUsers) {
			System.out.println(boardUser.toString());
			RecommendResDTO recommendBoard = new RecommendResDTO(boardUser.getBoard().getId(), boardUser.getUser().getNickname(), boardUser.getUser().getImoji(), boardUser.getBoard().getTitle(), boardUser.getBoard().getDate(), boardUser.getBoard().getMember(), boardUser.getBoard().getGender());
			recommendBoards.add(recommendBoard);
		}
		
		return recommendBoards;
	}

}

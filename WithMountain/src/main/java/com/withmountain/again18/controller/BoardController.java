
package com.withmountain.again18.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.withmountain.again18.domain.BoardDTO;
import com.withmountain.again18.domain.BoardUserDTO;
import com.withmountain.again18.domain.BoardListResDTO;
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
	
	
	/*
	 * @RequestMapping(value="/board",method=RequestMethod.GET) public
	 * List<BoardDTO> openBoardList(){ return boardService.selectBoardList(); }
	 */
	
	
	@RequestMapping(value="/board/write",method=RequestMethod.POST)
	public void insertBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.insertBoard(board);
	}
	
	
	@RequestMapping(value="/board/{boardId}",method=RequestMethod.GET)
	public BoardDTO openBoardDetail(@PathVariable("boardId")int boardId) throws Exception{
		return boardService.selectBoardDetail(boardId);
		
	}
	
	@GetMapping(value="/board/recommend")
	ResponseEntity<List<BoardListResDTO>> getRecommendedBoardList(@SessionAttribute(name = SessionConstants.LOGIN_USER, required = false) UserDTO loginUser) {
		
		List<BoardUserDTO> boardUsers = boardUserService.getRecommendBoardList(loginUser);
		List<BoardListResDTO> recommendBoards = bindBoardListRes(boardUsers);
		
		return ResponseEntity.ok(recommendBoards);
		
	}
	
	@GetMapping(value="/board")
	ResponseEntity<List<BoardListResDTO>> getBoardsByUser(@SessionAttribute(name = SessionConstants.LOGIN_USER, required = false) UserDTO loginUser, @RequestParam(value="userId", required=false) String userId) {
		if (loginUser==null)
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		else if (userId==null) {
			List<BoardUserDTO> boards = boardUserService.getBoardList(loginUser.getId());
			return ResponseEntity.ok(bindBoardListRes(boards));
		}
		else {
			List<BoardUserDTO> boards = boardUserService.getBoardsByUser(userId);
			return ResponseEntity.ok(bindBoardListRes(boards));
		}
			
	}
	
	/*
	@RequsetMapping(value="/board/{boardId}",method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDTO board) throws Exception{
		boardService.updateBoard(board);
		return
	}
	*/
	
	private List<BoardListResDTO> bindBoardListRes(List<BoardUserDTO> boardUsers) {
		List<BoardListResDTO> recommendBoards = new ArrayList<BoardListResDTO>();
		
		for (BoardUserDTO boardUser: boardUsers) {
			System.out.println(boardUser.toString());
			BoardListResDTO recommendBoard = new BoardListResDTO(boardUser.getBoard().getId(), boardUser.getUser().getNickname(), boardUser.getUser().getImoji(), boardUser.getBoard().getTitle(), boardUser.getBoard().getDate(), boardUser.getBoard().getUpdateTime(), boardUser.getBoard().getMember(), boardUser.getBoard().getGender());
			recommendBoards.add(recommendBoard);
		}
		
		return recommendBoards;
	}

}

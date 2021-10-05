package com.withmountain.again18.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.withmountain.again18.domain.BoardDTO;


@SpringBootTest
    class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@Test
	public void testOfInsert() {
		BoardDTO params=new BoardDTO();
		params.setTitle("1번 게시글 제목");
		params.setContent("1번 게시글 내용");
		//params.setId(1);
		params.setUserId(12);
		params.setClimbing_member(3);
		params.setConnection_link("www.gachon.ac.kr");
		params.setGender(0);
		
		
		int result=boardMapper.insertBoard(params);
		System.out.println("결과는"+result+"입니다");
	}
	
	@Test
	public void testOfSelectDetail() {
		BoardDTO board=boardMapper.selectBoardDetail((int)1);
		try {
			String boardJson=new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(board);
			System.out.println("===========================");
			System.out.println(boardJson);
			System.out.println("===========================");
			}catch (JsonProcessingException e) {
			e.printStackTrace();
			}
		
	}
	
	@Test
	public void testMultipleInsert() {
		for(int i=2;i<=50;i++) {
			BoardDTO params=new BoardDTO();
			params.setTitle(i+"번 게시글 제목");
			params.setContent(i+"번 게시글 내용");
			params.setId(i);
			params.setUserId(i+1);
			boardMapper.insertBoard(params);
			System.out.println(">>"+i+"번째 글 작성완료");
		}
	}
	
	@Test
	public void testSelectList(){
		int boardTotalCount=boardMapper.selectBoardTotalCount();
		if(boardTotalCount>0) {
			List<BoardDTO> boardList=boardMapper.selectBoardList();
			if(CollectionUtils.isEmpty(boardList)==false) {
				for(BoardDTO board:boardList) {
					System.out.println("====================");
					System.out.println(board.getTitle());
					System.out.println(board.getContent());
					System.out.println(board.getId());
					System.out.println(board.getUserId());
					System.out.println("====================");

					
				}
			}
		}
	}
	
	
	
	@Test
	public void testOfUpdate() {
		BoardDTO params = new BoardDTO();
		params.setTitle("1번 게시글 제목 수정");
		params.setContent("1번 게시글 내용 수정");
		params.setId(1);
		params.setUserId(15);
		params.setClimbing_member(20);
		params.setConnection_link("www.gachon.ac.kr");
		params.setGender(1);

		int result = boardMapper.updateBoard(params);
		if (result == 1) {
			BoardDTO board = boardMapper.selectBoardDetail((int) 1);
			try {
				String boardJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(board);

				System.out.println("=========================");
				System.out.println(boardJson);
				System.out.println("=========================");

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/*
	@Test
	public void testOfDelete() {
		int result = boardMapper.deleteBoard((long) 1);
		if (result == 1) {
			BoardDTO board = boardMapper.selectBoardDetail((long) 1);
			try {
				String boardJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(board);

				System.out.println("=========================");
				System.out.println(boardJson);
				System.out.println("=========================");

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
	}
	
	*/
	
	
	
	
	
	
	

}

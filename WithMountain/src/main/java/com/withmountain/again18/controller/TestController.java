package com.withmountain.again18.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.withmountain.again18.domain.TestDTO;
import com.withmountain.again18.mapper.TestMapper;

@RestController
public class TestController {
	@Autowired
	private TestMapper testMapper;
	
	@GetMapping("/api")
	private String test() {
		return "hello World!";
	}
	
	@GetMapping("/api/testDB")
	private List<TestDTO> testDB() {
		return testMapper.selectTestList();
	}

}

package com.withmountain.again18.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/api")
	private String test() {
		return "hello World!";
	}

}

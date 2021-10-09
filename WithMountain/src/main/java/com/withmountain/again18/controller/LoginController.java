package com.withmountain.again18.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.support.SessionStatus;

import com.withmountain.again18.domain.LoginReqDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.service.LoginService;
import com.withmountain.again18.util.SessionConstants;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	ResponseEntity<String> login(@RequestBody LoginReqDTO reqBody, HttpServletRequest request) {

		try {
			
			UserDTO loginUser = loginService.login(reqBody);
			
			if (loginUser!=null) {
				HttpSession session = request.getSession();	// 세션이 있으면 있는 세션 반환, 없으면 신규 세션을 생성하여 반환
			    session.setAttribute(SessionConstants.LOGIN_USER, loginUser);	// 세션에 로그인 회원 정보 보관
			    
			    return ResponseEntity.ok("Login Success!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}
	
	@PostMapping("/logout")
	ResponseEntity<String> logout(@SessionAttribute(name = SessionConstants.LOGIN_USER, required = false) UserDTO loginUser, HttpServletRequest request) {
		try {
			if (loginUser==null)
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
			
			HttpSession session = request.getSession(false);
			session.invalidate();
			return ResponseEntity.ok("Logout Success!");
		} catch(Exception e) {
			
			return ResponseEntity.status(500).build();
		}
	}

}

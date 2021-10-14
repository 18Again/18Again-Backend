package com.withmountain.again18.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.withmountain.again18.domain.CreateUserResDTO;
import com.withmountain.again18.domain.UpdateUserTasteResDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.service.UserService;
import com.withmountain.again18.util.SessionConstants;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping()
	ResponseEntity<UserDTO> getUserByEamil(HttpServletRequest req, @RequestParam(value="userId", required=false) String userId) {
		UserDTO user = null;
		
		HttpSession session = req.getSession();
		if (session.getAttribute(SessionConstants.LOGIN_USER)==null)
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		
		try {
			user = userService.getUserByUserId(userId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return (user==null)? new ResponseEntity<UserDTO>(user, HttpStatus.NO_CONTENT): new ResponseEntity<UserDTO>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/double")
	ResponseEntity<String> checkDoubleUser(@RequestParam(value="nickname", required=false) String nickname, @RequestParam(value="userId", required=false) String userId) {
		if (nickname==null&&userId==null)
			return ResponseEntity.badRequest().build();
		
		int cnt = 0;
		
		try {
			if (nickname==null) {
				cnt = userService.getUserCntByUserId(userId);
			} else {
				cnt = userService.getUserCntByNickname(nickname);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(Integer.toString(cnt), HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<CreateUserResDTO> createUser(@RequestBody UserDTO newUser, HttpServletRequest request) {
		try {
			boolean result = userService.registerUser(newUser);
			
			if (result) {
				newUser = userService.getUserByUserId(newUser.getUserId());
				CreateUserResDTO resBody = new CreateUserResDTO(newUser.getId(), 
																newUser.getUserId(), 
																newUser.getNickname(), 
																newUser.getGender(), 
																newUser.getAge(), 
																newUser.getImoji());
				
				HttpSession session = request.getSession();	// 세션이 있으면 있는 세션 반환, 없으면 신규 세션을 생성하여 반환
			    session.setAttribute(SessionConstants.LOGIN_USER, newUser);	// 세션에 로그인 회원 정보 보관
			    
				return new ResponseEntity<CreateUserResDTO>(resBody, HttpStatus.CREATED);
			} else {
				return ResponseEntity.badRequest().build();
			}
		} catch(Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}

	@PutMapping("/taste")
	ResponseEntity<UpdateUserTasteResDTO> createUserTaste(@SessionAttribute(name = SessionConstants.LOGIN_USER, required = false) UserDTO loginUser, @RequestBody UserDTO taste) {
		try {
			taste.setId(loginUser.getId());
			boolean result = userService.registerUser(taste);
			
			if (result) {
				UpdateUserTasteResDTO resBody = new UpdateUserTasteResDTO(taste.getExercise(),
																		taste.getDifficulty(), 
																		taste.getClimbingLevel(),
																		taste.getFrequency(),
																		taste.getFriendship(),
																		taste.getClimbingMate());
				
				return new ResponseEntity<UpdateUserTasteResDTO>(resBody, HttpStatus.CREATED);
			} else {
				return ResponseEntity.badRequest().build();
			}
		} catch(Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}
}

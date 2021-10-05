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
	ResponseEntity<UserDTO> getUserById(HttpServletRequest req, @RequestParam(value="id", required=false) long id) {
		UserDTO user = null;
		
		HttpSession session = req.getSession();
		if (session.getAttribute(SessionConstants.LOGIN_USER)==null)
			return ResponseEntity.status(401).build();
		
		try {
			user = userService.getUserById(id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return (user==null)? new ResponseEntity<UserDTO>(user, HttpStatus.NO_CONTENT): new ResponseEntity<UserDTO>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/double")
	ResponseEntity<String> checkDoubleUser(@RequestParam(value="nickname", required=false) String nickname, @RequestParam(value="email", required=false) String email) {
		if (nickname==null&&email==null)
			return ResponseEntity.badRequest().build();
		
		int cnt = 0;
		
		try {
			if (nickname==null) {
				cnt = userService.getUserCntByEmail(email);
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
				newUser = userService.getUserByEmail(newUser.getEmail());
				CreateUserResDTO resBody = new CreateUserResDTO(newUser.getId(), 
																newUser.getEmail(), 
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
	ResponseEntity<UpdateUserTasteResDTO> createUserTaste(@RequestBody UserDTO taste) {
		try {
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

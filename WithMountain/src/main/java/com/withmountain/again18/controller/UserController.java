package com.withmountain.again18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.withmountain.again18.domain.CreateUserDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/{id}")
	ResponseEntity<UserDTO> getUserById(@PathVariable(value="id") long id) {
		UserDTO user = null;
		
		try {
			user = userService.getUserById(id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return (user==null)? new ResponseEntity<UserDTO>(user, HttpStatus.NO_CONTENT): new ResponseEntity<UserDTO>(user, HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<CreateUserDTO> createUser(@RequestBody CreateUserDTO newUser) {
		try {
			boolean result = userService.registerUser(newUser);
			
			if (result) {
				return new ResponseEntity<CreateUserDTO>(newUser, HttpStatus.CREATED);
			} else {
				return ResponseEntity.badRequest().build();
			}
		} catch(Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.badRequest().build();
		}
	}

}

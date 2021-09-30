package com.withmountain.again18.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.withmountain.again18.domain.UserDTO;

@SpringBootTest
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	void insertUserTest() {
		try {
			UserDTO newUser = new UserDTO();
			newUser.setNickname("test1");
			newUser.setEmail("test1@gmail.com");
			newUser.setPasswd("1234");
			newUser.setGender(1);
			newUser.setAge(3);
			newUser.setImoji("TIGER");
			
			int result = userMapper.insertUser(newUser);
			assertEquals(result, 1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void selectUserTest() {
		try {
			UserDTO selectedUser = userMapper.selectUser((long) 125);
			System.out.println(selectedUser.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

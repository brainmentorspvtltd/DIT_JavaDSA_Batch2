package com.brainmentors.chatapp.dao;

import java.sql.Connection;

import com.brainmentors.chatapp.dto.UserDTO;

public class UserDAO {
	
	public int register(UserDTO userDTO) {
		
		Connection conn = null;
		
		String userId = userDTO.getUserid();
		char []password = userDTO.getPassword();
		
		String query = "insert into users values ('"+userId+"'"+",'"+password+"'"+",'A'";
		System.out.println(query);
		
		System.out.println("User ID : " + userId);
		System.out.println("User Password : " + password);
		return 0;
	}
	
	void login() {
		
	}
}

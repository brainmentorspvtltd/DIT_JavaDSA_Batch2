package com.brainmentors.chatapp.dto;

public class UserDTO {
	private String userid;
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	private char[] password;
	
	public UserDTO(String userid, char []password) {
		this.userid = userid;
		this.password = password;
	}
}

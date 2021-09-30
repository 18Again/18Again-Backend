package com.withmountain.again18.domain;

public class LoginReqDTO {
	private String email;
	private String passwd;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "LoginReqDTO [email=" + email + ", passwd=" + passwd + "]";
	}

}

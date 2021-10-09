package com.withmountain.again18.domain;

public class LoginReqDTO {
	private String userId;
	private String passwd;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "LoginReqDTO [userId=" + userId + ", passwd=" + passwd + "]";
	}

}

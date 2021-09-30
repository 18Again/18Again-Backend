package com.withmountain.again18.domain;

public class CreateUserDTO {
	private String nickname;
	private String email;
	private String passwd;
	private int gender;
	private int age;
	private String imoji;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
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
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImoji() {
		return imoji;
	}
	public void setImoji(String imoji) {
		this.imoji = imoji;
	}
	
	@Override
	public String toString() {
		return "CreateUserDTO [nickname=" + nickname + ", email=" + email + ", passwd=" + passwd
				+ ", gender=" + gender + ", age=" + age + ", imoji=" + imoji + "]";
	}
}

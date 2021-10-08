package com.withmountain.again18.domain;

public class CreateUserResDTO {
	private Long id;
	private String email;
	private String nickname;
	private int gender;
	private int age;
	private String imoji;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public CreateUserResDTO(Long id, String email, String nickname, int gender, int age, String imoji) {
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.gender = gender;
		this.age = age;
		this.imoji = imoji;
	}

	@Override
	public String toString() {
		return "CreateUserResDTO [id=" + id + ", email=" + email + ", nickname=" + nickname + ", gender=" + gender
				+ ", age=" + age + ", imoji=" + imoji + "]";
	}
	
}

package com.withmountain.again18.domain;

public class UserDetailDTO {
	
	private Long id;
	private String nickname;
	//private String userId;
	private String imoji;
	private int gender;
	private int age;
	private int friendship;
	private int climbingMate;
	private double climbingLevel;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/*
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	*/
	public String getImoji() {
		return imoji;
	}
	public void setImoji(String imoji) {
		this.imoji = imoji;
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
	public int getFriendship() {
		return friendship;
	}
	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}
	public int getClimbingMate() {
		return climbingMate;
	}
	public void setClimbingMate(int climbingMate) {
		this.climbingMate = climbingMate;
	}
	public double getClimbingLevel() {
		return climbingLevel;
	}
	public void setClimbingLevel(double climbingLevel) {
		this.climbingLevel = climbingLevel;
	}
	@Override
	public String toString() {
		return "UserDetailDTO [id=" + id + ", nickname=" + nickname + ", imoji=" + imoji + ", gender=" + gender
				+ ", age=" + age + ", friendship=" + friendship + ", climbingMate=" + climbingMate + ", climbingLevel="
				+ climbingLevel + "]";
	}
	
	
	

}

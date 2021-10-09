package com.withmountain.again18.domain;

public class UserDTO {

	private Long id;
	private String nickname;
	private String userId;
	private String passwd;
	private int gender;
	private int age;
	private int friendship;
	private int climbingMate;
	private double climbingLevel;
	private double difficulty;
	private double exercise;
	private double frequency;
	private String imoji;
	
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
	public double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	public double getExercise() {
		return exercise;
	}
	public void setExercise(double exercise) {
		this.exercise = exercise;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public String getImoji() {
		return imoji;
	}
	public void setImoji(String imoji) {
		this.imoji = imoji;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", nickname=" + nickname + ", userId=" + userId + ", passwd=" + passwd
				+ ", gender=" + gender + ", age=" + age + ", friendship=" + friendship + ", climbingMate="
				+ climbingMate + ", climbingLevel=" + climbingLevel + ", difficulty=" + difficulty + ", exercise="
				+ exercise + ", frequency=" + frequency + ", imoji=" + imoji + "]";
	}
	
	
}

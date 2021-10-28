package com.withmountain.again18.domain;

public class BoardDetailDTO {
	
	
	private UserDetailDTO user;
	private BoardPartDetailDTO board;
	public UserDetailDTO getUser() {
		return user;
	}
	public void setUser(UserDetailDTO user) {
		this.user = user;
	}
	public BoardPartDetailDTO getBoard() {
		return board;
	}
	public void setBoard(BoardPartDetailDTO board) {
		this.board = board;
	}
	@Override
	public String toString() {
		return "BoardDetailDTO [user=" + user + ", board=" + board + "]";
	}
	
	
	
	
	
	/*
	private int boardId;
	private String date;
	private int member;
	private int gender;
	private String content;

	
	private String userId;
	private String nickname;
	private String imoji;
	private double climbingLevel;
	private int friendship;
	private int userGender;
	private int age;
	
	public BoardDetailDTO( int boardId,String date,int member,int gender,String content,
			String userId,String nickname,String imoji,double climbingLevel,int friendship,int userGender,int age) {
		
		super();
		
		this.boardId=boardId;
		this.date=date;
		this.member=member;
		this.content=content;
		this.userId=userId;
		this.nickname=nickname;
		this.imoji=imoji;
		this.climbingLevel=climbingLevel;
		this.friendship=friendship;
		this.userGender=userGender;
		this.age=age;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getImoji() {
		return imoji;
	}

	public void setImoji(String imoji) {
		this.imoji = imoji;
	}

	public double getClimbingLevel() {
		return climbingLevel;
	}

	public void setClimbingLevel(double climbingLevel) {
		this.climbingLevel = climbingLevel;
	}

	public int getFriendship() {
		return friendship;
	}

	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}

	public int getUserGender() {
		return userGender;
	}

	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BoardDetailDTO [boardId=" + boardId + ", date=" + date + ", member=" + member + ", gender=" + gender
				+ ", content=" + content + ", userId=" + userId + ", nickname=" + nickname + ", imoji=" + imoji
				+ ", climbingLevel=" + climbingLevel + ", friendship=" + friendship + ", userGender=" + userGender
				+ ", age=" + age + "]";
	}
	
	*/

}

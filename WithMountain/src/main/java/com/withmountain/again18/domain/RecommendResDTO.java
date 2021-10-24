package com.withmountain.again18.domain;

import java.time.LocalDateTime;

public class RecommendResDTO {
	private int boardId;
	private String nickname;
	private String imoji;
	private String title;
	private String date;
	private int member;
	private int gender;
	
	public RecommendResDTO(int boardId, String nickname, String imoji, String title, String date, int member,
			int gender) {
		super();
		this.boardId = boardId;
		this.nickname = nickname;
		this.imoji = imoji;
		this.title = title;
		this.date = date;
		this.member = member;
		this.gender = gender;
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
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	
	@Override
	public String toString() {
		return "BoardUserDTO [nickname=" + nickname + ", imoji=" + imoji + ", boardId=" + boardId + ", title=" + title
				+ ", date=" + date + ", member=" + member + ", gender=" + gender + "]";
	}
}

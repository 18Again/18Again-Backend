package com.withmountain.again18.domain;

public class BoardListResDTO {

	private int boardId;
	private String nickname;
	private String imoji;
	private String title;
	private String date;
	private String updateTime;
	private int member;
	private int gender;
	
	public BoardListResDTO(int boardId, String nickname, String imoji, String title, String date, String updateTime,
			int member, int gender) {
		super();
		this.boardId = boardId;
		this.nickname = nickname;
		this.imoji = imoji;
		this.title = title;
		this.date = date;
		this.updateTime = updateTime;
		this.member = member;
		this.gender = gender;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
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

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
		return "BoardListResDTO [boardId=" + boardId + ", nickname=" + nickname + ", imoji=" + imoji + ", title="
				+ title + ", date=" + date + ", updateTime=" + updateTime + ", member=" + member + ", gender=" + gender
				+ "]";
	}
}

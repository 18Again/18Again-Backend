package com.withmountain.again18.domain;

public class BoardPartDetailDTO {
	
	private int id;
	private String title;
	private String date;
	private int member;
	private int gender;
	private String content;
	private String link;

	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "BoardPartDetailDTO [id=" + id + ", title=" + title + ", date=" + date + ", member=" + member
				+ ", gender=" + gender + ", content=" + content + ", link=" + link + "]";
	}

	
	

}

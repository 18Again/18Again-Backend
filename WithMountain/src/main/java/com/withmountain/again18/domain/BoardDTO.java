package com.withmountain.again18.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class BoardDTO {

	private int id;
	private int userId;
	private String title;
	private int member;
	private String link;
	private String content;
	private int boardGender;
	private String date;
	private String insertTime;
	private String updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBoardGender() {
		return boardGender;
	}
	public void setBoardGender(int boardGender) {
		this.boardGender = boardGender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", userId=" + userId + ", title=" + title + ", member=" + member + ", link="
				+ link + ", content=" + content + ", boardGender=" + boardGender + ", date=" + date + ", insertTime="
				+ insertTime + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

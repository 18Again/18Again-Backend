package com.withmountain.again18.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class BoardDTO {

	private int id;
	private int userId;
	private String title;
	private int climbing_member;
	private String connection_link;
	private String content;
	private int gender;
	
	private String climbing_date;
	

	private LocalDateTime insert_time;
	private LocalDateTime update_time;
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
	public int getClimbing_member() {
		return climbing_member;
	}
	public void setClimbing_member(int climbing_member) {
		this.climbing_member = climbing_member;
	}
	public String getConnection_link() {
		return connection_link;
	}
	public void setConnection_link(String connection_link) {
		this.connection_link = connection_link;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public LocalDateTime getInsertTime() {
		return insert_time;
	}
	public void setInsertTime(LocalDateTime insertTime) {
		this.insert_time = insertTime;
	}
	public LocalDateTime getUpdateTime() {
		return update_time;
	}
	public void setUpdateTime(LocalDateTime updateTime) {
		this.update_time = updateTime;
	}
	
	public String getClimbing_date() {
		return climbing_date;
	}
	public void setClimbing_date(String climbing_date) {
		this.climbing_date = climbing_date;
		
	}
	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", userId=" + userId + ", title=" + title + ", climbing_member=" + climbing_member
				+ ", connection_link=" + connection_link + ", content=" + content + ", gender=" + gender
				+ ", climbing_date=" + climbing_date + ", insert_time=" + insert_time + ", update_time=" + update_time
				+ "]";
	}

	
	
	
}

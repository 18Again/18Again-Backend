package com.withmountain.again18.domain;

public class TestDTO {
	private Long id;
	private String content;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "TestDTO [id=" + id + ", content=" + content + "]";
	}
	

}

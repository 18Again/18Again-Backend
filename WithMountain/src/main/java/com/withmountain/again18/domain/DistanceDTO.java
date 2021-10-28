package com.withmountain.again18.domain;

public class DistanceDTO {
	
	private Long id;
	private Long userId1;
	private Long userId2;
	private double distance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId1() {
		return userId1;
	}
	public void setUserId1(Long userId1) {
		this.userId1 = userId1;
	}
	public Long getUserId2() {
		return userId2;
	}
	public void setUserId2(Long userId2) {
		this.userId2 = userId2;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public DistanceDTO() {
		
	}
	
	public DistanceDTO(Long userId1, Long userId2, double distance) {
		this.userId1 = userId1;
		this.userId2 = userId2;
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "DistanceDTO [id=" + id + ", userId1=" + userId1 + ", userId2=" + userId2 + ", distance=" + distance
				+ "]";
	}

}

package com.withmountain.again18.domain;

public class BoardUserDTO {
	
	private UserDTO user;
	private BoardDTO board;
	private double distance = -1.0;
	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public BoardDTO getBoard() {
		return board;
	}
	public void setBoard(BoardDTO board) {
		this.board = board;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "BoardUserDTO [user=" + user + ", board=" + board + ", distance=" + distance + "]";
	}
}

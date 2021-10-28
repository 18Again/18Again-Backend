package com.withmountain.again18.domain;

import java.time.LocalDateTime;

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
	public String getDate() {
		return board.getDate();
	}
	
	@Override
	public String toString() {
		return "BoardUserDTO [user=" + user + ",\n board=" + board + ",\n distance=" + distance + "]\n";
	}
}

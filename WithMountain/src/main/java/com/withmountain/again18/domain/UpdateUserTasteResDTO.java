package com.withmountain.again18.domain;

public class UpdateUserTasteResDTO {
	private double exercise;
	private double difficulty;
	private double climbingLevel;
	private double frequency;
	private int friendship;
	private int climbingMate;
	
	public double getExercise() {
		return exercise;
	}
	public void setExercise(double exercise) {
		this.exercise = exercise;
	}
	public double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	public double getClimbingLevel() {
		return climbingLevel;
	}
	public void setClimbingLevel(double climbingLevel) {
		this.climbingLevel = climbingLevel;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public int getFriendship() {
		return friendship;
	}
	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}
	public int getClimbingMate() {
		return climbingMate;
	}
	public void setClimbingMate(int climbingMate) {
		this.climbingMate = climbingMate;
	}
	
	public UpdateUserTasteResDTO(double exercise, double difficulty, double climbingLevel, double frequency, int friendship, int climbingMate) {
		this.exercise = exercise;
		this.difficulty = difficulty;
		this.climbingLevel = climbingLevel;
		this.frequency = frequency;
		this.friendship = friendship;
		this.climbingMate = climbingMate;
	}
	
	@Override
	public String toString() {
		return "UpdateUserTasteResDTO [exercise=" + exercise + ", difficulty=" + difficulty + ", climbingLevel="
				+ climbingLevel + ", frequency=" + frequency + ", friendship=" + friendship + ", climbingMate="
				+ climbingMate + "]";
	}
}

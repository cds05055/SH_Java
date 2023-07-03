package com.kh.day06.oop.member;

public class Member {
	// 입력 받을거 3개 정도 작성
	// 캡슐화의 원칙 적용해서 구성
	private String name;
	private int score1, score2;
	
	public Member() {}
	
	public Member(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public double getAvg() {
		double avg = (double)(this.score1 + this.score2)/3;
		return avg;
	}
	
	//get
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
}

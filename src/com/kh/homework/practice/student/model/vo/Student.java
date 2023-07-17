package com.kh.homework.practice.student.model.vo;

public class Student {
	// 필드
	private String name;
	private int score1;
	private int score2;
	
	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int score1, int score2) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	//메소드
	// getter
	
	public String getName() {
		return name;
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
	
	// setter
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

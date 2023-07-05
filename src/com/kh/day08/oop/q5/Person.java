package com.kh.day08.oop.q5;

public class Person {
	private String name;
	private int money;
	
	public Person() {
		name = null;
		money = 0;
	}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(Coffee caffe, int money) {
		this.money -= money;
		caffe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name +"님의 잔액은 "+ this.money + "원 입니다.");
	}
}

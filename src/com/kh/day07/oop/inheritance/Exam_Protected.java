package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent{
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
//		super.pri = 4; // The field Parent.pri is not visible
	}
}

class ShapePoint extends Point{
	private ShapePoint() {}
	void set() {
		super.pub = 1;
//		super.def = 2; // The field Point.def is not visible
		super.pro = 3; 
		// protected로 선언된 변수는 상속이 되어 있으면 
		// 다른 패키지에 있더라도 사용가능
//		super.pri = 4; // The field Point.pri is not visible
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}

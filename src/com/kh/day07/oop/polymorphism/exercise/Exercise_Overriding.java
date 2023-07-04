package com.kh.day07.oop.polymorphism.exercise;

class SuperClass{
	void paint() { // 3번실행
		draw(); // 4번 실행 (자식의 draw()와 오버라이딩 되어
				// 동적 바인딩으로 자식의 draw()를 실행
	}
	void draw() {
		System.out.println("Super Object"); // 7번 실행(출력)
	}
}
class SubClass extends SuperClass{
	void paint() { // 1번 실행
		super.paint(); // 2번 실행(super라 부모의 paint()를 실행)
		super.draw(); // 6번 실행(super라 부모의 draw()를 실행)
	}
	void draw() {
		System.out.println("Sub Object"); // 5번 실행(출력)
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
		
		// 답
		// Sub Object
		// Super Object
	}
}

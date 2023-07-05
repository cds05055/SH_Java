package com.kh.day08.oop.abstractpkg;

class Line extends Shape{
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// => 추상메소드 오버라이딩 해야함, 하지 않을거면 class에 abstract 붙여야함
	@Override
	public void draw() {
		
	}
}

abstract public class Shape {
	
	public Shape() {}
	
	public void paint() {}
	abstract public void draw();
	// 1. Abstract methods do not specify a body => {} 삭제
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	// 3. The type Shape must be an abstract class to define abstract methods => class에 abstract 붙여야함
}

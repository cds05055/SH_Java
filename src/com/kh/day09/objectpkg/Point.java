package com.kh.day09.objectpkg;

public class Point {
	private int x,y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj; //다운캐스팅
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}

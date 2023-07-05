package com.kh.day08.oop.q5;

public abstract class Coffee {
	private String shopName;
	
	public Coffee() {
		
	}
	
	public Coffee(String shopName) {
		this.shopName = shopName;
	}
	
	abstract public void makeCoffee(int money);
}

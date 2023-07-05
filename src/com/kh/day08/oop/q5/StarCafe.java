package com.kh.day08.oop.q5;

public class StarCafe extends Coffee {
	public void makeCoffee(int money) {
		if(money == Menu.STAR_AMERICANO) {
			System.out.println("주문하신 아메리카노 나왔습니다.");
		}else if(money == Menu.STAR_LATTE) {
			System.out.println("주문하신 라떼 나왔습니다.");
		}else {
			System.out.println("금액이 부족합니다.");
		}
		
	}
}

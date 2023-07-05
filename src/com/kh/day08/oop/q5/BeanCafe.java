package com.kh.day08.oop.q5;

public class BeanCafe extends Coffee{
	public void makeCoffee(int money) {
		if(money == Menu.CONG_AMERICANO) {
			System.out.println("주문하신 아메리카노 나왔습니다.");
		} else if(money == Menu.CONG_LATTE) {
			System.out.println("주문하신 라떼 나왔습니다.");
		}		
	}
}

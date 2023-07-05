package com.kh.day08.oop.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// cvc
	// 비밀번호
	int cardNum;
	static int serialNum = 10000;
	
	public Card() {
		cardNum = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNum + "입니다.");
	}
}

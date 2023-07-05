package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// 1. 상수만 가능
	public String NAME = "";
	// 1. Illegal modifier for the interface field PhoneInterface.name;
	// 	  only public, static & final are permitted => public, static final만 허용
	// 2. The blank final field NAME may not have been initialized => 초기화 필수
	public static final int TIME_OUT = 10000;
	
	public abstract void receiveCall();
	void sendCall(); // public abstract 생략 가능
	abstract void printLogo(); // public 생략 가능
	// 3. Abstract methods do not specify a body => 추상클래스로 선언하였기 때문에 {}삭제하고 ;을 붙여야함
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해 작성
		// 하위 호환성을 유지하고, 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

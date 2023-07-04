package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		for(;;) {
			int choice = mFunc.printMenu();
			if(choice == 1) {
				mFunc.inputInfo();
				
			} else if(choice == 2) {
				mFunc.printInfo();
				
			} else if(choice == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;				
			} else {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}
		}
	}
}

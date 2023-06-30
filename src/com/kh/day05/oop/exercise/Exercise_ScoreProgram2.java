package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;) {
			printMenu();
			int mainMenu = sc.nextInt();
			if(mainMenu == 1) {
				Student.inpnutScore();
			} else if(mainMenu == 2) {
				Student.printScore();
				break;
			} else if(mainMenu == 3){
				showGoodBye();
				break;
			} else {
				printException();
			}
		}
		
	}
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void showGoodBye() {
		System.out.println("종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴에서 선택해주세요.");
	}
}

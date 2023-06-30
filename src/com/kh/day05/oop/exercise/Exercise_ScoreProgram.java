package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;) {
			printMenu();
			int mainMenu = sc.nextInt();
			if(mainMenu == 1) {
				inpnutScore();
			} else if(mainMenu == 2) {
				printScore();
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
	
	public static void inpnutScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.printf("평균 : %.2f\n", (double)(kor + eng + math)/3);
	}
	
	public static void showGoodBye() {
		System.out.println("종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴에서 선택해주세요.");
	}
	
	
}

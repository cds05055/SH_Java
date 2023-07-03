package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int index = 0;
	public static void main(String [] args)
	{
//		Student stdOne = new Student();
		Student [] stds = new Student[3];
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			printMenu();
			int mainMenu = sc.nextInt();
			if(mainMenu == 1) {
				inputScore(stds);
			} else if(mainMenu == 2) {
				printScore(stds);
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
	
	public static void inputScore(Student [] stds) {
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < stds.length; i++) {
			stds[index] = new Student();
			System.out.println("====== 이름 입력 ======");
			System.out.print("이름 : ");
			stds[index].name = sc.nextLine();
			// next()와 nextLine()의 차이점
			// next() : 공백이 없는 문자열 ex) 이름, ...
			// nextLine() : 공백이 있는 문자열 ex) 주소, ...
			// 두번째 이름 입력 받을 때 전에 입력 받은 엔터로 인해 공백삽입
			
			
			System.out.println("====== 성적 입력 ======");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();
			sc.nextLine();		// 개행 입력 받아줌
			if(index < stds.length) index++;
//		}
	}
	
	public static void printScore(Student [] stds) {
		for(int i = 0; i <= index; i++) {
			System.out.println("====== 성적 출력 ======");
			System.out.println("이름 : " + stds[i].name);
			System.out.println("국어 : " + stds[i].kor);
			System.out.println("영어 : " + stds[i].eng);
			System.out.println("수학 : " + stds[i].math);			
			System.out.println("총점 : " + stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
	}
	
	public static void showGoodBye() {
		System.out.println("종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴에서 선택해주세요.");
	}
	
	
}

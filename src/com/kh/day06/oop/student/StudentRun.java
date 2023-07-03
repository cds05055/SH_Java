package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Student [] std = new Student[2];
		finish :
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				inputScore(std);
				break;
			case 2 :
				printScore(std);
				break;
			case 3 : 
				checkPass(std);
				break;
			case 4 : 
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			}
		}
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("=== 학생 성적 확인 프로그램 ===");
		System.out.println();
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice= sc.nextInt();
//		System.out.println(1);
//		System.out.println("A");
//		System.out.println("Hello Java");
//		System.out.println(true);
		return choice;
	}
	public static void inputScore(Student [] std) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < std.length; i++) {
			System.out.printf("%d번째 학생 정보 입력\n", i+1);
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차점수 입력 : ");
			int score1 = sc.nextInt();
			System.out.print("2차점수 입력 : ");
			int score2 = sc.nextInt();
			std[i] = new Student();
			std[i].setName(name);
			std[i].setScore1(score1);
			std[i].setScore2(score2);
		}
	}
	public static void printScore(Student [] std) {
		for(int i = 0; i < std.length; i++) {
			System.out.printf("%d번째 학생 정보 출력\n", i+1);
			System.out.printf("%s 학생의 점수는\n1차 점수 : %d점, 2차 점수 : %d점입니다.\n", 
					std[i].getName(), std[i].getScore1(), std[i].getScore2());
			System.out.println();
		}
	}
	
	public static void checkPass(Student [] std) {
		for(int i = 0; i < std.length; i++) {
			double avg = std[i].getAvg();
			int num1 = std[i].getScore1();
			int num2 = std[i].getScore2();
			System.out.printf("%d번째 %s 학생의 확인결과\n", i+1, std[i].getName());
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재평가 대상입니다.");								
				}else if (num2 < 40) {
					System.out.println("2차 시험 재평가 대상입니다.");				
				}else {
					System.out.println("통과하셨습니다.");					
				}
			} else if(avg < 60) {
				if(num1 < 60) {
					System.out.println("1차 시험 재평가 대상입니다.");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재평가 대상입니다.");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

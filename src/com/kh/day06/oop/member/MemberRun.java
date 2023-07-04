package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		Member [] memArr = new Member[2];
		Scanner sc = new Scanner(System.in);
//		String name = "";
//		int score1 = 0;
//		int score2 = 0;
		
		for(;;) {
			int input = printMenu();
			if(input == 1) {
				inputScore(memArr);
				
			} else if(input == 2) {
				printScore(memArr);
				
			} else if(input == 3) {
				checkPass(memArr);
				
			} else if(input == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
		

	}
	private static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("=== 학생 성적 확인 프로그램 ===");
		System.out.println();
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int input = sc.nextInt();
		return input;
	}

	private static void inputScore(Member[] memArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < memArr.length; i++) {
			System.out.printf("%d번째 학생 정보 입력\n", i+1);
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차점수 입력 : ");
			int score1 = sc.nextInt();
			System.out.print("2차점수 입력 : ");
			int score2 = sc.nextInt();
			memArr[i] = new Member();
			memArr[i].setName(name);
			memArr[i].setScore1(score1);
			memArr[i].setScore2(score2);
		}
	}
	
	private static void printScore(Member[] memArr) {
		for(int i = 0; i < 2; i++) {
			System.out.printf("%d번째 학생 정보 출력\n", i+1);
			System.out.printf("%s 학생의 점수는\n1차 점수 : %d점, 2차 점수 : %d점입니다.\n", 
					memArr[i].getName(), memArr[i].getScore1(), memArr[i].getScore2());
			System.out.println();					
		}
	}
	
	private static void checkPass(Member[] memArr) {
		// 평균 60이상 합격이며 1, 2차의 점수가 40점 이상이면 합격
		// 평균 60 이하 이면 불합격, 대신 1, 2차중 60점을 넘은 과목은 합격
		for(int i = 0; i < memArr.length; i++) {
			int num1 = memArr[i].getScore1();
			int num2 = memArr[i].getScore2();
			double avg = memArr[i].getAvg();
			System.out.printf("%s 학생은 ",memArr[i].getName());
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 재시험 대상입니다.");
				} else if(num2 < 40) {
					System.out.println("2차 재시험 대상입니다.");
				}
				if(num1 >= 40 && num2 >= 40){
					System.out.println("통과입니다.");
				}
			} else if(avg < 60) {
				if(num1 < 60) {
					System.out.println("1차 재시험 대상입니다.");
				}
				if(num2 < 60) {
					System.out.println("2차 재시험 대상입니다.");					
				}
			}
		}
	}

}

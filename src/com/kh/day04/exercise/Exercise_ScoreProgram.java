package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		for(;;) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");		
			int mainMenu = sc.nextInt();
			if(mainMenu == 1) {
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
			} else if(mainMenu == 2) {
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				int result = kor + eng + math;
				System.out.println("총점 : " + result);
				double avg = result / 3;
				System.out.printf("평균 : %.2f\n", avg);
				break;
			} else if(mainMenu == 3){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 메뉴에서 선택해주세요.");
			}
		}

	}
}

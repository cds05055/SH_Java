package com.kh.day04.myexception.exercise;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력
		// 다시 입력받는 프로그램을 작성하여라
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		// 1. num1 cannot be resolved to a variable (변수 선언 해야함)
//		int num1, num2;
		// 2. The local variable num1 may not have been initialized(변수 초기화 해야함)
//		num1 = 0;
//		num2 = 0;
		for(;;) {
			try {
				System.out.print("첫번째 정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 하나 입력 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 목은 %d입니다.\n", num1, num2, result);			
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			} catch(InputMismatchException e) {
				System.out.println("정수만 입력해주세요!");
				sc.next();
			}
		}
	}
	
	public void practice2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램 작성
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외를 처리하여 
		// 다시 입력 받도록 출력
		Scanner sc = new Scanner(System.in);
		for(;;) {
			try {
				System.out.print("첫번째 정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 하나 입력 : ");
				int num2 = sc.nextInt();
				System.out.print("세번째 정수 하나 입력 : ");
				int num3 = sc.nextInt();
				int result = num1 + num2 + num3;
				System.out.printf("%d, %d, %d의 합은 %d 입니다.\n", num1, num2, num3, result);			
			} catch(InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다. 정수만 입력해주세요.");
				sc.next();
			}			
		}
		
		
		
		
		
	}
}

package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int result = 0;
		for(int i = 1; i < 11; i++) {
			result = result + i;
			if(i != 10) {
				System.out.print(i + "+");				
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.print(result);
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 사이의 정수 하나 입력 : ");
		int inputNum = sc.nextInt();
		if((inputNum >= 1) && (inputNum <= 9)) {
			System.out.println(inputNum + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(inputNum + "x" + j + " = " + inputNum*j);
			}
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void forDoubleExercise1() {
		// 구구단 출력
//		for(int k = 2; k < 10; k++) {
//			System.out.println(k + "단");
//			for(int h = 1; h < 10; h++){
//				if(h != 9) {
//					System.out.println(k + " * " + h + " = " + k*h);					
//				}else {
//					System.out.print(k + " * " + h + " = " + k*h + " ");
//				}
//			}			
//		}
		
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(i*j < 10) {
					System.out.print(j + "x" + i + " = " + i*j + "    ");
				} else {
					System.out.print(j + "x" + i + " = " + i*j + "   ");
				}
			}
			System.out.println("");
		}
		
		for(int k = 1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + "x" + k + " = " + h*k + "    ");
			}
		}
	}
	
	public void forDoubleExercise2() {
		//0시 0분부터 23시 59분까지 출력
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n", i, j);
			}
		}
	}
	
	public void forDoubleExercise3() {
		// 별 찍기 (10개)
		int count = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println("");
		}
	}
	
	public void numOutput1() {
	    //1번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int input = sc.nextInt();
		
	}
}

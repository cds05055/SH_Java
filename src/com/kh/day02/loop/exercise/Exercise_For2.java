package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	public static void main(String [] args)
	{
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
}

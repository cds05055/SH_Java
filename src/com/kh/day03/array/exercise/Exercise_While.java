package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void whileExercise1() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
		// 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 14 입니다.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(true)
		{
			if(num != -1)
			{
				System.out.print("정수 하나 입력 : ");
				num = sc.nextInt();
				sum += num;	
			}else {
				break;
			}
		}			
		System.out.println("입력하신 수의 합은 " + (sum+1) + "입니다.");
	}
	
	public void wihleExercise2() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력
		int num = 1;
		int sum = 0;
		
		while(num <= 100)
		{
			if(num % 2 != 0 ) {
				sum += num;
			}
			num++;				
		}
		System.out.println("1 ~ 100 사이의 홀수의 합은 " + sum + "입니다.");
	}
}

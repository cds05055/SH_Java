package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] agrs)
	{
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

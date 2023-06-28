package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args)
	{
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
}

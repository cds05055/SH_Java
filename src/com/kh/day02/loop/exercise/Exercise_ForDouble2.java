package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		//0시 0분부터 23시 59분까지 출력
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n", i, j);
			}
		}
		
		
		
	}
}

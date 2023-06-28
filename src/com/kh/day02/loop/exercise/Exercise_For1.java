package com.kh.day02.loop.exercise;

public class Exercise_For1 {
	public static void main(String [] args)
	{
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
}

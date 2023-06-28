package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
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
}

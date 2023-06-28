package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args)
	{
//		System.out.println("논리연산자 예제");
//		int num1 = 50;
//		int num2 = 30;
//		boolean result1, result2, result3, result4;
//		// 남자이면서 평균평점 4.3이상인 사람
//		// 컴퓨터공학과 또는 경영학과인 사람
//		result1 = (num1 == num2) && (num1 < num2); // false
//		result2 = (num1 < num2) || (num1 == num2); // false
//		result3 = (num1 > num2) && (num1 != num2); // true
//		result4 = (num1 > num2) || (num1 == num2); // true
		
		
//		System.out.println("result1의 결과값 : " + result1);
//		System.out.println("result2의 결과값 : " + result2);
//		System.out.println("result3의 결과값 : " + result3);
//		System.out.println("result4의 결과값 : " + result4);
		
		int a = 70;
		int b = 55;
		boolean result1, result2, result3, result4;
		result1 = (a == b) || (a++ < 100);
		// 		  false		  true
		// a = 71, b = 55, result1 = true
		
		result2 = (a < b) && (--b < 55);
		//		  false		  true
		// a = 71, b = 55, result2 = false
		// AND연산자의 경우 앞의 비교값이 false일 때 뒤의 비교값은 계산하지 않음.
		
		result3 = (a != b) && (b-- < a++);
		//		  true		  true
		// a = 72, b = 54, result3 = true
		
		result4 = (a++ != b) || (b++ >= 85);
		//		  true	         true
		// a = 73, b = 54, result4 = true
		
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		System.out.println("a의 결과값 : " + a);
		System.out.println("b의 결과값 : " + b);
		
		
	}
}

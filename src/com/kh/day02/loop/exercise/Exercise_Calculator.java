package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			char input = sc.next().charAt(0);
			int result = 0;
//			if(input == '+') {
//				result = num1 + num2;
//				System.out.println(num1 + " + " + num2 + " = " + result);
//			} else if (input == '-')	{
//				result = num1 - num2;
//				System.out.println(num1 + " - " + num2 + " = " + result);
//			} else if (input == '*')	{
//				result = num1 * num2;
//				System.out.println(num1 + " x " + num2 + " = " + result);
//			} else if (input == '/')	{
//				result = num1 / num2;
//				System.out.println(num1 + " / " + num2 + " = " + result);
//			} else {
//				result = num1 % num2;
//				System.out.println(num1 + " % " + num2 + " = " + result);
//			}
			
			switch(input) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-' : 
				result = num1 - num2;
				break;
			case '*' : 
				result = num1 * num2;
				break;
			case '/' : 
				result = num1 / num2;
				break;
			case '%' : 
				result = num1 % num2;
				break;
			}
			System.out.println(num1 + " " + input + " " + num2 + " = " + result);
		}
		
	}
}

package com.kh.day02.operator.exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args)
	{
		// 입력받은 문자가 대문자인지 소문자인지 확인
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		System.out.println("영문자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
//		String words = sc.next();
//		System.out.println("문자열 확인 : " + words);
		// 문자열에서 첫번째 인덱스 값을 자르니까 문자가 됨
		char word = sc.next().charAt(0);
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 65) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
	}
}

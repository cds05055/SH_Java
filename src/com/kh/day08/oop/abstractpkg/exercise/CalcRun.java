package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
		Calculator calc = new GoodCalc(); // 업캐스팅
		// Calculator는 추상클래스이기 때문에 객체 생성이 안됨
		// Cannot instantiate the type Calculator
		
		int [] a = {178, 668};
		calc.average(a);
		System.out.printf("평균 : %.2f\n", calc.average(a));
		
		System.out.printf("합 : %d\n", calc.add(423, 245));
		System.out.printf("합 : %d\n", calc.substract(423, 245));
		
		
	}
}

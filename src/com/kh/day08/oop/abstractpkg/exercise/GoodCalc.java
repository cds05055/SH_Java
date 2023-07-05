package com.kh.day08.oop.abstractpkg.exercise;

public class GoodCalc extends Calculator{
	// The type GoodCalc must implement the inherited abstract method Calculator.add(int, int)
	@Override
	public int add(int a, int b) {
		// a와 b를 합하여 리턴
//		int result = a+b;
//		return result;
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// a와 b를 빼서 리턴
//		int result = a-b;
//		return result;
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// 배열을 입력받아 a와 b의 평균을 구해 리턴
		// 평균 = 전체 합 / 갯수
		// 전체합 => 배열에서 하나씩 꺼내서 합쳐야 하므로 누적합 필요
		// 누적합 => sum += num;
		
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
//		double avg = result / (double)a.length;
//		return avg;
		return result / (double)a.length;
	}
	
	
	
	
	
	
	
	
	
}

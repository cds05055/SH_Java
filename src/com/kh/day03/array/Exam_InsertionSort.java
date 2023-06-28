package com.kh.day03.array;

public class Exam_InsertionSort {
	public static void main(String [] args)
	{
		// 삽입정렬이란?
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스 값을 0번에서 N-1번 인덱스까지 비교
		// {2, 5, 4, 1, 3}
		// 첫번째 : 2하고 5 비교 -> x
		// {2, 5, 4, 1, 3} => 첫번째 결과
		// 두번째 : 5하고 4 비교 -> 교환
		// {2, 4, 5, 1, 3}
		// 5하고 2 비교 -> x
		// { 2, 4, 5, 1, 3} => 두번째 결과
		// 세번째 : 5하고 1비교 -> 교환
		// {2, 4, 1, 5, 3}
		// 4하고 1 비교 -> 교환
		// {2, 1, 4, 5, 3}
		// 2하고 1 비교 -> 교환
		// {1, 2, 4, 5, 3} => 세번째 결과
		// 네번째 : 5하고 3 비교 -> 교환
		// {1, 2, 4, 3, 5}
		// 4하고 3 비교 -> 교환
		// {1, 2, 3, 4, 5} => 네번째 결과
		
		int [] arrs = {2, 5, 4, 1, 3};
		// {2, 5, 4, 1, 3}
		// j = 1
		for (int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}			
			}			
		}
		//배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		// {2, 5, 4, 1, 3}
		// j = 1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
		// {2, 4, 5, 1, 3}
		// j = 2
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
		// {2, 4, 5, 1, 3}
		// j = 3
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
		
		// {2, 4, 1, 5, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
		
		// {2, 1, 4, 5, 3}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
		//{1, 2, 4, 5, 3}
		// j = 4
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
		
		// {1, 2, 4, 3, 5}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
		// {1, 2, 3, 4, 5}
		
		
		
		
		
		
		
		
	}
}

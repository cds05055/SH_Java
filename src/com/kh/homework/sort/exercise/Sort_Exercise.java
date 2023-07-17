package com.kh.homework.sort.exercise;

public class Sort_Exercise {
	public static void main(String[] args) {
		// 정렬
		// 3 2 1이 되도록 바꿔보기
//		int [] nums = {2, 1, 3};
//		
//		// nums[0]의 값을 저장할 임시 변수 temp 선언 후 nums[0] 값을 삽입
//		int temp = nums[0];
//		
//		// nums[0]에 nums[1]의 값을 삽입 
//		// nums = {1, 1, 3}, temp = 2
//		nums[0] = nums[1];
//		
//		// nums[1]에 temp 값을 삽입
//		// nums = {1, 2, 3}, temp = 2
//		nums[1] = temp;
//		
//		// temp에 nums[0]값을 삽입
//		// nums = {1, 2, 3}, temp = 1
//		temp = nums[0];
//		
//		// nums[0]에 nums[2]의 값을 삽입
//		// nums = {3, 2, 3}, temp = 1
//		nums[0] = nums[2];
//		
//		// nums[2]에 temp값 삽입
//		// nums = {3, 2, 1}, temp = 1
//		nums[2] = temp;
//		for(int i =0; i < nums.length; i++) {
//			System.out.print(nums[i]);
//		}
		
		// 삽입정렬
		// 안에 for문이 감소식이면 삽입정렬
		int [] arrs = {2, 5, 4, 1, 3};
		// j = 0 ~ 3
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
		System.out.println("삽입정렬");
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		
		// 선택정렬
		// 비교할 두 값중 작은 값을 왼쪽에 넣고 큰 값은 오른쪽에 둠
		// 바깥 for문에 교환식이 있다면 선택정렬
		int min = 0;
		
		for(int j = 0; j < arrs.length - 1; j++) {
			min = j;
			for(int i = j + 1; i < arrs.length; i++) {
				if(arrs[min] > arrs[i]) {
					min = i;
				}
			}			
			int temp = arrs[j];
			arrs[j] = arrs[min];
			arrs[min] = temp;
		}
		//배열 출력
		System.out.println("선택정렬");
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		// 버블정렬
		// 가장 쉬운 정렬
		// 이중 for문 둘다 증가식이라면 버블정렬
		for(int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;			
				}			
			}			
		}
		//배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
	}
}

package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고 제일 큰 수를 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
//		nums[0] = sc.nextInt();
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.print("양수 1개 입력 : ");
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];				
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
	}
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라.(단 배열의 크기는 5이다.)
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		int sum = 0;
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("정수 하나 입력 : ");
			arrs[i] =sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
	}
	
	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램 작성
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요.(-포함)");
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사 시작
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i]; // 성별자리 전까지 차례대로 값 대입			
			} else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);		
		}	
	}
	
	// 끝판왕
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		
		Random rand = new Random(); // 난수 선언
		int [] lotto = new int[6]; // 배열선언
		for(int i = 0; i < lotto.length; i++) {
			// 랜덤한 숫자 6개 생성 후 lotto배열에 대입
			lotto[i] =  rand.nextInt(45)+1;
			// 중복 체크
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 정렬 전 출력
		System.out.print("로또번호(정렬전) : ");
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] != lotto[lotto.length-1]) {
				System.out.print(lotto[i] + " ");				
			}else {
				System.out.println(lotto[i] + " ");
			}
		}
		// 정렬
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				} 
			} 
		}
		// 출력
		System.out.print("로또번호(정렬후) : ");
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			}
		}
	
	public void rockScissorPaper() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.println();
			System.out.println("==== 가위 바위 보 게임 ====");
			System.out.print("숫자를 선택하세요.(1.가위 / 2.바위 / 3.보) : ");
			int person = sc.nextInt();
			int computer = rand.nextInt(3)+1;
			System.out.println("============ 결과 ==============");
			switch(person) {
			case 1 : 
				System.out.println("당신은 가위를 냈습니다.");
				switch(computer) {
				case 1 : 
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("================================");
					System.out.println("비겼습니다.");
					break;
				case 2 : 
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 졌습니다. ㅠㅠ");
					break;
				case 3 : 
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 이겼습니다. ^^*");
					break;
				}
				break;
			case 2 : 
				System.out.println("당신은 바위를 냈습니다.");
				switch(computer) {
				case 1 : 
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 이겼습니다. ^^*");
					break;
				case 2 : 
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("================================");
					System.out.println("비겼습니다.");
					break;
				case 3 : 
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 졌습니다. ㅠㅠ");
					break;
				}
				break;
			case 3 : 
				System.out.println("당신은 보를 냈습니다.");
				switch(computer) {
				case 1 : 
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 졌습니다. ㅠㅠ");
					break;
				case 2 : 
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("================================");
					System.out.println("당신이 이겼습니다. ^^*");
					break;
				case 3 : 
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("================================");
					System.out.println("비겼습니다.");
					break;
				}
				break;
			}
		}
	}

}


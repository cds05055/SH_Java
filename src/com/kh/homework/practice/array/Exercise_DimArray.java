package com.kh.homework.practice.array;

import java.util.Scanner;

public class Exercise_DimArray {
	public static void Exercise1() {
		int [][] arrs = new int [5][5];
		for(int j = 0; j < 5; j++) {
			int k = 5; 
			k = k*(j+1);
			for(int i = 0; i < 5; i++) {
				arrs[j][i] = k;
				k--;
			}			
		}
		
		// 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}			
			System.out.println();
		}
	}
	
	public static void Exercise2() {
		int [][] arrs = new int [5][5];
		int k = 1; 
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}			
		}
		
		
		// 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Exercise3() {
		int [][] arrs = new int [5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs.length; j++) {
				arrs[j][i] = k;
				k++;
			}			
		}
		
		// 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}			
			System.out.println();
		}
	}
	
	
	public static void Exercise4() {
		int [][] arrs = new int [5][5];
		int k = 1; 
		
		for(int h = 0; h < 5; h++) {
			if((h+1) % 2 != 0) {
				for(int i = 0; i < 5; i++) {
					arrs[h][i] = k;
					k++;
				}
			} else {
				for(int j = 4; j >= 0; j--) {
					arrs[h][j] = k;
					k++;
				}
			}
		}
				
		// 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}			
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
//		Prctice1();
//		Exercise4();
		Exercise1();
	}
	
	public static void Prctice1() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3 3.4), (3.5 3.6), (3.7 4.0), (4.1 4.2)
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%.2f ", score[i][j]);
				sum += score[i][j];
			}
			System.out.println();
		}
		int firstLength = score.length;
		int secondLength = score[0].length;
		avg = sum / (firstLength * secondLength);
		System.out.println("4년간 전체 평점의 평균은 " + avg);
		
	}
	
	public static void Exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3 3.4), (3.5 3.6), (3.7 4.0), (4.1 4.2)
		Scanner sc = new Scanner(System.in);
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
//		double [][] score = new double[4][2];
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.print((i+1) + "학년 " + (j+1) + "학기 학점을 입력해주세요. : ");
//				score[i][j] = sc.nextDouble();
//			}
//		}
		
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
		
		
		
		double sum = 0;
		// 출력
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f ", score[i][j]);
				sum += score[i][j];
			}			
			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 학점 평균은 : %.2f\n", result);
		
		
	}
}

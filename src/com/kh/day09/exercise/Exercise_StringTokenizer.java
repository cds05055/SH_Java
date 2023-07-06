package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력
		String query = "홍길동/장화/홍련/콩쥐/팥쥐";
		String [] result = new String[5];
		int count = 0;
		
		// 1. 전체 출력
//		StringTokenizer st = new StringTokenizer(query, "/");
//		while(st.hasMoreElements()) {
//			System.out.println(st.nextToken());
//		}
		
		// 2. 홍련만 출력
		StringTokenizer st = new StringTokenizer(query, "/");
		while(st.hasMoreElements()) {
			if(st.nextToken().equals("홍련")) {
				System.out.println("홍련");
			}
		}
	}
}

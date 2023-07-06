package com.kh.day09.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=kite&addr=seoul&age=21";
//		String [] words = query.split("&"); 
		// split의 리턴값이 배열이기 때문에 배열 선언 해줘야함
		
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}

package com.kh.day11.iostream.exercise;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Writer writer = null;
		
		try {
			// 경로 입력 및 입력한 이름으로 파일명 생성
			System.out.print("저장할 파일명 입력(확장자 제외) : ");
			String title = sc.next();
			sc.nextLine(); // 공백 받기
			System.out.println("'" + title + ".txt'" + "파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			writer = new FileWriter("src/com/kh/day11/iostream/" + title + ".txt");
			
			// 무한반복하여 입력 받다 exit가 입력되면 반복 종료
			for(int i = 1;;i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				writer.write(input + "\n");
				if(input.equals("exit")) {
					System.out.println("종료되었습니다.");
					break;
				}
			}
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

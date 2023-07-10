package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_WriterStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
//			char [] cBuf = "JDBC/JSP/Servlet".toCharArray();
			System.out.println("입력할 문자를 작성해주세요");
			String title = sc.next();
			sc.nextLine();
			writer.write(title);
			writer.flush();
			System.out.println("파일 작성 완료");
			
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

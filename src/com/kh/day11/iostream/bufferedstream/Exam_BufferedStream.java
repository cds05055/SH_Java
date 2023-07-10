package com.kh.day11.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// 성능향상 보조 스트림, BufferedStream
public class Exam_BufferedStream {
	public static void main(String[] args) {
		// 버퍼 크기를 5로 하고 표준 출력 스트림(System.out)과 연결한
		// 버퍼 출력 스트림을 생성
		FileReader fir = null;
		int readCharCount;
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
		Scanner sc = new Scanner(System.in);
		// System.out.println("전달값");
		
		// 보조스트림을 사용하는 방식
		try {
			fir = new FileReader("src/com/kh/day11/iostream/khpad.txt");
			while((readCharCount = fir.read()) != -1) {
				bout.write(readCharCount);
			}
			bout.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

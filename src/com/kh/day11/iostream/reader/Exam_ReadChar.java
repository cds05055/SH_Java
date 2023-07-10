package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3];
			String result = "";
			for(;;) {
				readCharCount = reader.read(cBuf);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

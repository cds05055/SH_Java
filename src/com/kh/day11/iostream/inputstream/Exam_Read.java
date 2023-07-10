package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		
		// Unhandled exception type FileNotFoundException
		// Ckecked Exception
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByte;
//			while(true) {
//				readByte = is.read();
//				if(readByte == -1) break;
//				System.out.print((char)readByte);
//			}
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				is.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

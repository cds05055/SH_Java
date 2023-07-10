package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// Cannot instantiate the type Reader
		
		// checked exception : 강제 예외처리
		try {
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			
			for(;;) {
				// Unhandled exception type IOException
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Unhandled exception type IOException
			try {
				reader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

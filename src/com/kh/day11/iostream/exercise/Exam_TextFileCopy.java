package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Exam_TextFileCopy {
	public static void main(String[] args) {
		// 문자 스트림 FileReader와 FileWriter를 이용하여
		// c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램 작성
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로
		File dest = new File("c:\\Temp\\system.txt"); // 복사 파일 경로
		
		// 입력
		InputStream is = null;
		
		// 출력
		OutputStream os = null;
		
		Reader reader = null;
		
		// c:\Temp 만들기
		File folderMake = new File("c:\\Temp");
		folderMake.mkdir();
		System.out.println("Temp 폴더가 만들어 졌습니다.");
		
		// system.txt에 c:\windows\system.ini를 복사하기
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte [] readBytes = new byte[1024];
			int readByteCount;
			
			// 복사 후 원하는 경로에 출력
			while((readByteCount = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.\n");
			
			// 콘솔에 system.txt 내용 출력
			System.out.println("system.txt의 내용");
			reader = new FileReader(dest);
			for(;;) {
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	}
}

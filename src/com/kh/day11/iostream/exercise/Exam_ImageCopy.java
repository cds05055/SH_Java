package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.
		InputStream is = null;
		OutputStream os = null;
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\copyimg.jpg");
		int readByte;
		byte [] readBytes = new byte[1024*10]; // 배열을 이용하여 10KB씩 쓰려고 함
		try {
			// Temp폴더가 없으면 만드는 코드
			File folder = new File("c:\\Temp");
			if(!folder.exists()) {
				folder.mkdir();
			}
			// 복사할 파일이 존재하는 경로
			is = new FileInputStream(src);
			
			// 붙여넣기 할 경로
			os = new FileOutputStream(dest);
			
			
			while(true) {
				// 복사 속도가 좀더 빠른 코드
				// 10KB씩 읽어서 복사
//				readByte = is.read();
				readByte = is.read(readBytes);
//				if(readByte == -1) break;
//				os.write((char)readByte);
				os.write(readBytes, 0, readByte);
				if(readByte < readBytes.length) break; // 읽은 갯수가 현저히 적어지면 반복문 탈출
			}
			is.close();
			os.close();
			System.out.printf("%s를 %s로 복사하였습니다.", src.getPath(), dest.getPath());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
		}
		
		
	}
}

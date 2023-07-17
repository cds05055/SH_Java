package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
//		연결 요청중...
//		연결 성공!!
//		클라이언트(나) : 하이요 일용자님
//		데이터 전송 성공!
//		서버(상대) : 네 안녕하세요
		String address = "127.0.0.1";
		int port = 5630;
		OutputStream os = null;
		Scanner sc= new Scanner(System.in);
		InputStream is = null;
		
		try {
			System.out.println("연결 요청중...");
			// 설정된 IP, PORT에 연결 요청
			Socket socket = new Socket(address, port);
			// 연결된 후 소켓 객체 생성
			System.out.println("연결 성공!!");
			
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
			while(true) {
				// 데이터 보내기 (OutputStream)
				// 프로그램 기준 내보내기이므로 OutputStream
				System.out.print("클라이언트(나) : ");
				String message = sc.nextLine();
				byte [] bytes = message.getBytes();
				// 보낼때 버퍼에 작성(write() 메소드 사용)
				os.write(bytes);
				// 버퍼 비워주기 (flush())
				os.flush();
				// 보내기 완료
				
				// 데이터 받기 (InputStream)
				// 프로그램 기준 가져오기이므로 InputStream
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				message = new String(bytes, 0, readByteNo);
				System.out.printf("서버(상대) : %s\n", message);
				// 받기 완료
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

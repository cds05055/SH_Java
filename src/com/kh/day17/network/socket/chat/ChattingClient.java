package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		String address = "127.0.0.1";
		int port = 5630;
		
		// 주 스트림
		InputStream is = null;
		OutputStream os = null;
		
		//보조 스트림 (기본 데이터 타입 입출력 도와줌)
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		try {
			// 채팅 서버 접속
			System.out.println("서버에 연결중입니다.");
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			
			// 채팅 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			while(true) {
				String recvMsg = dis.readUTF();	// 받기
				System.out.printf("서버(상대) : %s\n", recvMsg);
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();	
				dos.writeUTF(sendMsg);	// 보내기
				dos.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseBallClient {

	public static void main(String[] args) {
//		클라이언트 소켓을 생성하였습니다.
//		/127.0.0.1
//		게임 준비 완료
//		--> 4 2 1
//		0스트라이크 0볼
//		--> 1 2 3
//		0스트라이크 1볼
//		--> 2 3 4
//		1스트라이크 0볼
//		--> 5 3 8
//		2스트라이크 0볼
//		--> 5 3 7
//		1스트라이크 1볼
//		--> 7 3 8
//		3스트라이크 0볼
//		축하합니다. 아웃입니다!
		String address = "127.0.0.1";
		int port = 5630;
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			Socket socket = new Socket(address, port);
			System.out.println("/" + address);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			System.out.println("게임 준비 완료");
			for(;;) {
				System.out.print("--> ");
				String sendMsg = sc.nextLine();
				
				// 보내기
				dos.writeUTF(sendMsg);
				dos.flush();
				// 보내기 종료
				
				// 받기
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				if(recvMsg.equalsIgnoreCase("error")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				if(recvMsg.startsWith("3")) {
					System.out.println("축하합니다. 아웃입니다!");
					break;
				}
				// 받기 종료
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

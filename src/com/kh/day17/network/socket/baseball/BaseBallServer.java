package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseBallServer {

	public static void main(String[] args) {
//		서버소켓을 생성하였습니다.
//		2023-07-18 12:04:56:15
//		클라이언트의 접속을 기다립니다.
//		클라이언트가 접속했습니다.
//		서버 숫자 -> 7 3 8
//		서버 준비 완료
//		받기 : 4 2 1
//		0스트라이크 0볼
//		받기 : 7 3 8
//		3스트라이크 0볼
//		아웃! 게임종료
		int port = 5630;
		Date date = new Date();
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String sysdate = trans.format(date);
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		int [] ranNums = new int[3];
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("서버 소켓을 생성하였습니다.");
			System.out.println(sysdate);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			// (int)(Math.random() * (최대값 - 최소값 +1) + 최소값)
			
			for(int i = 0; i < ranNums.length; i++) {
				ranNums[i] = (int)(Math.random() * 9+1);
				for(int j = 0; j < i; j++) {
					if(ranNums[i] == ranNums[j]) {
						i--;
						break;
					}
				}
			}
			
			System.out.printf("서버 숫자 -> %d %d %d\n", ranNums[0], ranNums[1], ranNums[2]);
			System.out.println("서버 준비 완료");
			
			for(;;) {
				// 받기
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				// 받기 종료
				
				// 스트라이크, 볼 로직
				String [] numArrs = recvMsg.split(" ");
				// 오류 메시지 출력
				if(numArrs.length != 3) {
					String errMsg = "error";
					dos.writeUTF(errMsg);
					dos.flush();
					continue;
				}
				int num1 = Integer.parseInt(numArrs[0]);
				int num2 = Integer.parseInt(numArrs[1]);
				int num3 = Integer.parseInt(numArrs[2]);
				int ball = 0;
				int strike = 0;
				
				for(int i = 0; i < numArrs.length; i++) {
					// 볼 카운트
					if(ranNums[i] == num1 || ranNums[i] == num2 || ranNums[i] == num3) {
						ball++;
					}
					// 스트라이크 카운트
					if(ranNums[i] == Integer.parseInt(numArrs[i])) {
						ball--;
						strike++;
					}
					
				}
				
				
				String sendMsg = strike + "스트라이크 " + ball + "볼";
				System.out.println(sendMsg);
				
				// 보내기
				dos.writeUTF(sendMsg);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
				//보내기 종료
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

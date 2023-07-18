package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트의 연결을 기다리고 있습니다..
		// 클라이언트와 연결되었습니다.
		// 받은 메시지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 5630;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			System.out.println("서버 구동중입니다.");
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
			for(int i = 1; i <= 50; i++) {
				Thread.sleep(10);
				System.out.print("=");
			}
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열 만듦
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					dos.flush();
					continue;
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch(operator) {
					case "+" : 
						result = String.valueOf(num1 + num2);
						break;
						
					case "-" : 
						result = num1 - num2 + "";
						break;
						
					case "*" : 
						result = num1 * num2 + "";
						break;
						
					case "/" : 
						result = num1 / num2 + "";
						break;
						
					case "%" :
						result = num1 % num2 + "";
						break;
				}
				dos.writeUTF(result);
				dos.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

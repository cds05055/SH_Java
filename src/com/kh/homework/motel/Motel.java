package com.kh.homework.motel;

import java.util.Scanner;

public class Motel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RoomFunction roomFunc = new RoomFunction();
		end:
		for(;;) {
			int choice = roomFunc.printMenu();
			switch(choice) {
				case 1 : 
					// 1. 입실
					roomFunc.checkInRoom();
					break;
				case 2 : 
					// 2. 퇴실
					roomFunc.checkOutRoom();
					break;
				case 3 : 
					// 3. 방 보기
					roomFunc.showRoom();
					break;
				case 4 : 
					// 4. 종료
					System.out.println("프로그램을 종료합니다.");
					break end;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
	}
}

package com.kh.homework.motel;

import java.util.Scanner;

public class RoomFunction {
	// 필드
	private Room [] roomArrs;
	
	// 생성자
	public RoomFunction() {
		roomArrs = new Room[10];
	}
	
	// 메소드
	public int printMenu() {
		// 메뉴
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.print("1. 입실    2. 퇴실    3. 방보기    4.종료\n");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void checkInRoom() {
		// 1. 입실
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번방에 입실 하시겠습니까? : ");
		int choice = sc.nextInt();
		if(choice > 10){
			System.out.println("존재하지 않는 방 입니다.");
		}
		for(int i = 0; i < roomArrs.length; i++) {
			if((i+1) == choice) {
				if(roomArrs[i] != null) {
					System.out.println(choice + "번 방에 손님이 있습니다.");
					break;
				}else {
					roomArrs[i] = new Room(choice);
					System.out.println(choice + "번 방에 입실 하셨습니다.");
					break;
				}
			} 
		}
		
	}
	
	public void checkOutRoom() {
		// 2. 퇴실
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번방에서 퇴실 하시겠습니까? : ");
		int choice = sc.nextInt();
		for(int i = 0; i < roomArrs.length; i++) {
			if((i+1) == choice) {
				if(roomArrs[i] != null) {
					roomArrs[i] = null;
					System.out.println(choice + "번 방에서 퇴실 하셨습니다.");
					break;
				}else {
					System.out.println(choice + "번 방은 현재 빈 방입니다");
					break;
				}
			}
			if(choice > 10){
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void showRoom() {
		// 3. 방 보기
		for(int i = 0; i < 10; i++) {
			if(roomArrs[i] == null) {
				System.out.println((i+1) + "번 방은 현재 빈 방입니다.");				
			}else {
				System.out.println((i+1) + "번 방은 현재 손님이 있습니다.");								
			}
		}
	}
}

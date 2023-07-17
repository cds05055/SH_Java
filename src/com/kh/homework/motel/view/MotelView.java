package com.kh.homework.motel.view;

import java.util.List;
import java.util.Scanner;

import com.kh.homework.motel.model.vo.Motel;

public class MotelView {
	
	public int printMenu() {
		// 메뉴
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.print("1. 입실    2. 퇴실    3. 방보기    4.종료\n");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	/**
	 * 1. 입실
	 * @return choice
	 */
	public int checkInRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번방에 입실 하시겠습니까? : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	
	public void checkOutRoom() {
		
	}
	
	public void showRoom(List<Motel> allList) {
		System.out.println("방 정보");
		int count = 1;
		for(Motel motel : allList) {
			if(motel.equals(null)) {
				System.out.printf("%d번 방은 현재 빈 방입니다.\n", count++);
			}else {
				System.out.printf("%d번 방은 현재 손님이 있습니다.\n", count++);
			}
		}
	}
	
	
	
	
	
	
	
	
	public void inputError(int choice) {
		System.out.println("존재하지 않는 방 입니다.");
	}

}

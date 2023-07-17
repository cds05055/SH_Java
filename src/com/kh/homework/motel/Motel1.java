package com.kh.homework.motel;

import java.util.Scanner;

public class Motel1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] roomArrs = new String[10];
		end:
		for(;;) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.print("1.입실     2.퇴실     3.방보기      4.종료\n");
			System.out.print("선택 > ");
			int choice = sc.nextInt();	
			switch(choice) {
			case 1: 
				System.out.print("몇번방에 입실하시겠습니까? : ");
				String choice1 = sc.next();
				roomArrs[0] = choice1;
				System.out.println(choice1 + "번 방에 입실하셨습니다.");
				break;
			case 2: 
				System.out.print("몇번방에 퇴실하시겠습니까? : ");
				String choice2 = sc.next();
				if(roomArrs[0] != null) {
					roomArrs[0] = null;
				}
				System.out.println(choice2 + "번 방에 퇴실하셨습니다.");
				break;
			case 3: 
				for(int i = 0; i < roomArrs.length; i++) {
					if(roomArrs[i] != null) {
						System.out.println((i+1) + "번 방은 현재 손님이 있습니다.");
					}else {
						System.out.println((i+1) + "번방이 현재 비어있습니다.");						
					}
				}
				break;
			case 4: 
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default : 
				System.out.println("잘못 선택하셨습니다.");
				break;
			}
		}
	}
}

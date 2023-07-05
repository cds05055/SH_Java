package com.kh.miniproject;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user01 = "";
		String user01Pw = "";
		
		String ckUser = "";
		String ckUserPw = "";
		
		int inputMoney = 0;
				
		finish:
		for(;;) {
			System.out.println("");
			System.out.println("ATM기 프로그램");
			System.out.println("1. 회원등록");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 잔고 확인");
			System.out.println("5. 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.println("======================");
					System.out.println("회원 등록을 선택하셨습니다.");
					System.out.print("회원명 : ");
					user01 = sc.next();
					sc.nextLine();
					System.out.print("비밀번호(4자리) : ");
					user01Pw = sc.next();
					sc.nextLine();
					System.out.print("위 정보가 맞으시면 Y, 아니라면 N을 입력해주세요 : ");
					char infoYN = sc.next().charAt(0);
					if(infoYN == 'N') {
						System.out.println("======================");
						System.out.println("취소하셨습니다. 메뉴선택으로 돌아갑니다.");
						System.out.println("======================");
						break;
					} else if(infoYN == 'Y') {
						System.out.println("======================");
						System.out.printf("%s 님이 등록되었습니다.\n감사합니다.\n", user01);
						System.out.println("======================");
						break;
					} else {
						System.out.println("======================");
						System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 번호를 입력해주세요.");
						System.out.println("======================");						
					}
					break;
					
				case 2 : 
					System.out.println("======================");
					System.out.println("입금하기를 선택하셨습니다.");
					System.out.println("1. 본인 계좌에 입금하기");
					System.out.println("2. 타인 계좌에 입금하기");
					System.out.println("3. 뒤로가기");
					System.out.print("메뉴 선택 : ");
					int inputChoice = sc.nextInt();
					if(inputChoice == 1) {
						System.out.println("======================");
						System.out.println("본인 계좌에 입금하기를 선택하셨습니다.");
						System.out.print("본인 성명 : ");
						ckUser = sc.next();
						sc.nextLine();
						System.out.print("비밀번호(4자리) : ");
						ckUserPw = sc.next();
						sc.nextLine();
						if(ckUser == user01 && ckUserPw == user01Pw) {
							System.out.println("======================");
							System.out.println("성명과 비밀번호가 일치합니다.");
							System.out.println("======================");
						} else if(ckUser != user01 || ckUserPw != user01Pw) {
							System.out.println("======================");
							System.out.println("성명 또는 비밀번호가 다릅니다.");
							System.out.printf("등록 시 성명 : %s, 비밀번호 : %s\n", user01, user01Pw);
							System.out.printf("입력 성명 : %s, 비밀번호 : %s\n", ckUser, ckUserPw);
							System.out.println("======================");
							return;
						}
						System.out.print("입금할 금액 : ");
						inputMoney = sc.nextInt();
						System.out.print("위 정보가 맞으시면 Y, 아니라면 N을 입력해주세요 : ");
						infoYN = sc.next().charAt(0);
						if(infoYN == 'N') {
							System.out.println("======================");
							System.out.println("취소하셨습니다. 메뉴선택으로 돌아갑니다.");
							System.out.println("======================");
							break;
						} else if(infoYN == 'Y') {
							System.out.println("======================");
							System.out.printf("%s 님 계좌에 %d원이 입금 되었습니다.\n이용해주셔서 감사합니다.\n", user01, inputMoney);
							System.out.println("======================");
							break;
						} else {
							System.out.println("======================");
							System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 번호를 입력해주세요.");
							System.out.println("======================");						
						}
					}else if(inputChoice == 2) {
						
					}else if(inputChoice == 3) {
						System.out.println("뒤로가기를 선택하셨습니다.");
						System.out.println("======================");
					}else {
						System.out.println("======================");
						System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 번호를 입력해주세요.");
						System.out.println("======================");
					}
					
					break;
					
				case 3 : 
					
					break;
					
				case 4 : 
					
					break;
					
				case 5 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default : 
					System.out.println("======================");
					System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 번호를 입력해주세요.");
					System.out.println("======================");
					break;
					
			}
		}
		
	}
}

package com.kh.miniproject;

import java.util.Scanner;

public class BankFunction {
	// 필드
	private Bank [] bankArrs;
//	private int count;
	
	
	// 생성자
	public BankFunction() {
		bankArrs = new Bank[100];
//		count = 0;
	}
	
	
	// 메소드
	// 메뉴 출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("ATM기 프로그램");
		System.out.println("1. 회원등록");
		System.out.println("2. 입금하기");
		System.out.println("3. 출금하기");
		System.out.println("4. 잔고 확인");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	// 1. 회원 등록
	public void signUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("회원 등록을 선택하셨습니다.");
		System.out.print("회원명 : ");
		String user = sc.next();
		sc.nextLine(); // 공백입력 방지
		System.out.print("계좌번호(4자리) : ");
		String userAccNum = sc.next();
		sc.nextLine(); // 공백입력 방지
		System.out.print("초기 입금 금액 : ");
		int userBalance = sc.nextInt();
		for(;;) {
			// infoYN에 Y나 N말고 다른 값이 들어 갔을 때 오류를 출력하고 다시 Y/N을 물어보기 위해
			// 무한루프 for문 작성
			System.out.print("위 정보가 맞으시면 Y, 아니라면 N을 입력해주세요 : ");
			char infoYN = sc.next().charAt(0);
			if(infoYN == 'N') {
				System.out.println("=========================================");
				System.out.println("취소하셨습니다. 메뉴선택으로 돌아갑니다.");
				System.out.println("=========================================");
				break;
			} else if(infoYN == 'Y') {
				// 객체 배열의 첫번째 인덱스부터 하나씩 확인하여 null값이 있는 곳에 객체 생성
				for(int i = 0; i < bankArrs.length; i++) {
					if(bankArrs[i] == null) {
						bankArrs[i] = new Bank(user, userAccNum, userBalance);
						System.out.println("=======================================");
						System.out.printf("%s 님이 등록되었습니다.\n감사합니다.\n", user);
						System.out.println("=======================================");
						break;
						// 생성이 완료되면 비교 for문 탈출
					}
				}
				break;
				// 취소를 선택 시 무한루프 for문을 탈출
			} else {
				// 입력한 정보 확인 변수 infoYN에 Y나 N말고 다른 값이 들어 갔을 때 출력하는 오류
				System.out.println("==========================================================");
				System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 글자를 입력해주세요.");
				System.out.println("==========================================================");
//				break;
			}
		}

	}
	
	// 2. 입금하기

	public void inputMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("입금하기를 선택하셨습니다.");
		System.out.println("1. 본인 계좌에 입금하기");
		System.out.println("2. 타인 계좌에 입금하기");
		System.out.println("3. 뒤로가기");
		System.out.print("메뉴 선택 : ");
		int inputChoice = sc.nextInt();
		if(inputChoice == 1) {
			System.out.println("=======================================");
			System.out.println("본인 계좌에 입금하기를 선택하셨습니다.");
			System.out.print("본인 성명 : ");
			String ckUser = sc.next();
			sc.nextLine();
			System.out.print("본인 계좌번호(4자리) : ");
			String ckUserAccNum = sc.next();
			sc.nextLine();
			// 회원 등록시 입력한 이름과 계좌번호 비교
			for(int i = 0; i < bankArrs.length; i++) {
				// 문자열을 비교할 때는 .equals(비교할 변수)사용
				// 문자열은 주소를 저장하기 때문에 내용이 같더라도 서로 다른 객체를 참조할 때
				// == 연산자를 사용 시 다르다고 출력됨
				if(bankArrs[i].getUser().equals(ckUser) && bankArrs[i].getAccountNum().equals(ckUserAccNum)) {
					System.out.println("본인확인이 완료되었습니다.");
					System.out.print("얼마를 입금하시겠습니까? : ");
					int moneyInMyAcc = sc.nextInt();
					// 입금할 금액을 받은 변수 moneyInMyAcc를 Bank 클래스의 balance에 누적
					bankArrs[i].plusMoney(moneyInMyAcc);
					System.out.printf("%d원 입금이 완료되었습니다.\n이용해주셔서 감사합니다.", moneyInMyAcc);
					break;
				}
				if(bankArrs[i] == null){
					// i번째 인덱스 객체 배열이 null이라면 break
					break;
				}
			}
		}
		
	}
	
	// 3. 출금하기
	public void outputMoney() {
		
	}
	
	// 4. 잔고확인
	public void printUserInfo() {
		System.out.println("====== 사용자 잔고확인 ======");
		for(int i = 0; i < bankArrs.length; i++) {
			if(bankArrs[i]!= null) {
				System.out.printf("%s 님의 계좌\n계좌번호는 %s이고 잔고는 %d원입니다.\n", 
						bankArrs[i].getUser(),
						bankArrs[i].getAccountNum(),
						bankArrs[i].getBalance());
				System.out.println("=============================");
				// for문에서 계속 반복하여 사용자 정보를 출력하다 null 값이 나오면 break
				if(bankArrs[i] == null) {
					break;					
				}
			} else if(bankArrs[i] == null) {
				// 객체 배열 내에 저장된 사용자 정보가 하나도 없다면 출력
				System.out.println("등록된 계좌가 없습니다.");
				System.out.println("=============================");
				break;
			}
		}
	}
	
	// 5. 종료하기
	public void offATM() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	// 6. 오류 메시지 출력
	public void errorMasage() {
		System.out.println("==================================================");
		System.out.println("잘못 입력하셨습니다. 메뉴에 해당하는 번호를 입력해주세요.");
		System.out.println("==================================================");
	}
	
	
	
	
	
	
	
}
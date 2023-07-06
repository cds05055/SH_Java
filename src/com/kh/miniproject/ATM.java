package com.kh.miniproject;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankFunction bankFunc = new BankFunction();
		
//		for(;;) {
//			int choice = bankFunc.printMenu();
//			if(choice == 1) {
//				// 1. 회원 등록
//				bankFunc.signUser();
//				
//			} else if(choice == 2) {
//				// 2. 입금하기
//				bankFunc.inputMoney();
//				
//			} else if(choice == 3) {
//				// 3. 출금하기
//				bankFunc.outputMoney();
//				
//			} else if(choice == 4) {
//				// 4. 잔고확인
//				bankFunc.printUserInfo();
//				
//			} else if(choice == 5) {
//				// 5. 종료
//				bankFunc.offATM();
//				break;
//				
//			} else {
//				// 오류 메시지 출력
//				bankFunc.errorMasage();
//			}
//			
//		}
		
		finish:
		for(;;) {
			int choice = bankFunc.printMenu();
			switch(choice) {
				case 1 : {
					// 1. 회원 등록
					bankFunc.signUser();
					break;					
				}
				case 2 : {
					// 2. 입금하기
					bankFunc.inputMoney();
					break;
				}
				case 3 : {
					// 3. 출금하기
					bankFunc.outputMoney();
					break;
				}
				case 4 : {
					// 4. 잔고확인
					bankFunc.printUserInfo();
					break;
				}
				case 5 : {
					// 5. 종료
					bankFunc.offATM();
					break finish;
				}
				default : {
					// 오류 메시지 출력
					bankFunc.errorMasage();
					break;
				}
			}
		}
	}
}

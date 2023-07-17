package com.kh.homework.motel.run;

import java.util.List;

import com.kh.homework.motel.controller.MotelController;
import com.kh.homework.motel.model.vo.Motel;
import com.kh.homework.motel.view.MotelView;

public class Run {
	public static void main(String[] args) {
		MotelView mView = new MotelView();
		MotelController mCtrl = new MotelController();
		end:
		for(;;) {
			int choice = mView.printMenu();
			mCtrl.readyRooms(null);
			switch(choice) {
				case 1 : 
					// 1. 입실
					choice = mView.checkInRoom();
					if(choice > 10) {
						mView.inputError(0);
					}
					// 여기까지 함 
					// 다음에 for문으로 손님유무 체크 해야 함
//					mCtrl.searchCustomer();
					break;
				case 2 : 
					// 2. 퇴실
					mView.checkOutRoom();
					break;
				case 3 : 
					// 3. 방 보기
					List<Motel> allList = mCtrl.showRoomInfo();
					mView.showRoom(allList);
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

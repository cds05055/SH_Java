package com.kh.homework.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.homework.motel.model.vo.Motel;

public class MotelController {
	List<Motel> mList;
	
	public MotelController() {
		mList = new ArrayList<Motel>();
	}

	public void searchCustomer(int choice) {
		for(Motel mOne : mList) {
			
		}
	}

	public void readyRooms(Motel customer) {
		for(int i = 0; i < 10; i++) {
			mList.add(customer);
		}
	}

	public List<Motel> showRoomInfo() {
		return mList;
	}
}

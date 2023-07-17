package com.kh.homework.practice.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.kh.day10.collection.student.Student;

public class ListRun {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());

		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
		
	}
	
	public void sListExample() {
		List<String> strList = new ArrayList<String>(); // 업캐스팅
//		ArrayList<String> aList = new ArrayList<String>();
		// 해도 되나 나중에 Framework 사용 시 List 인터페이스로 받는게 나음
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
//		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		System.out.println("==============");
		strList.add(2, "체리");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		strList.set(2, "파인애플");
		System.out.println("==============");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		strList.remove(2);
		System.out.println("==============");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		Object obj = objList.get(0);
		
		int num = (int)obj; // 다운캐스팅
		//Type mismatch: cannot convert 
		// from Object to int
		
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		//Type mismatch: cannot convert 
		// from Object to String
		
		char cOne = (char)objList.get(2);
	}
	
	public void intExample() {
//		int [] nums = new int [3];
		IntList nums = new IntList();
//		nums[0] = 1;
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		int result = nums [0];
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		nums = {};, mums = new int [3];
		nums.clear();
	}
}

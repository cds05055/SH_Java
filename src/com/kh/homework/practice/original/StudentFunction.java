package com.kh.homework.practice.original;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
//	Student [] students;
	List<Student> stdList;
//	int index;
	
	public StudentFunction() {
//		students = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int choice =sc.nextInt();
		return choice;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
//		students[index] = std;
//		index++;
		
	}
	
	public void searchInfoByName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student student : stdList) {
			if(student.getName().equals(searchName)) {
				System.out.println(student.toString());
				break;
			}
		}
	}

	public void printInfo() {
		for(Student student : stdList) {
			System.out.println(student.toString());
		}
//		for(int i = 0; i< stdList.size(); i++) {
//			System.out.println(stdList.get(i).getName() + "/");
//			System.out.println(stdList.get(i).toString());
//		}

	}
	

	public void checkPass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("확인할 학생의 이름을 적어주세요. : ");
		String ckName = sc.next();
		sc.nextLine();
		for(Student student : stdList) {
			double avg = student.getAvg();
			int score1 = student.getScore1();
			int score2 = student.getScroe2();
			if(ckName.equals(student.getName())) {
				// 재평가 여부 출력
				System.out.printf("%s 학생의 확인결과\n", ckName);
				if(avg >= 60) {
					if(score1 < 40) {
						System.out.println("1차 시험 재평가 대상입니다.");
						System.out.println();
						break;
					}else if (score2 < 40) {
						System.out.println("2차 시험 재평가 대상입니다.");				
						System.out.println();
						break;
					}else {
						System.out.println("통과하셨습니다.");					
						System.out.println();
						break;
					}
				} else if(avg < 60) {
					if(score1 < 60) {
						System.out.println("1차 시험 재평가 대상입니다.");
						System.out.println();
						break;
					}
					if(score2 < 60) {
						System.out.println("2차 시험 재평가 대상입니다.");
						System.out.println();
						break;
					}
				}
			} else {
				System.out.println("존재하지 않는 학생입니다.");
				System.out.println();
				break;
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

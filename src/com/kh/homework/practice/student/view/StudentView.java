package com.kh.homework.practice.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.homework.practice.student.model.vo.Student;

public class StudentView {

	public int printMenu1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 수정(이름)");
		System.out.println("4. 학생 정보 전체 출력");
		System.out.println("5. 학생 정보 삭제(이름)");
		System.out.println("6. 학생 정보 전체 삭제");
		System.out.println("7. 재평가 대상 여부 확인");
		System.out.println("8. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int choice =sc.nextInt();
		return choice;
	}

	public Student inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		return std;
	}

	public String inputStudentName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 이름 : ");
		String searchName = sc.next();
		return searchName;
	}

	public void printAllStudentInfo(List<Student> allList) {
		System.out.println("====== 학생 정보 전체 출력 ======");
		int count = 1;
		for(Student student : allList) {
			System.out.printf("%d번째 학생\n이름 : %s\n1차 점수 : %d, 2차 점수 : %d\n"
					, count++
					, student.getName()
					, student.getScore1()
					, student.getScore2());
			System.out.println();
		}
	}

	
	
	
	// 성공 메시지
	public String printSuccess(String msg) {
		System.out.println("[서비스 성공] " + msg + "성공!");
		System.out.println("======================");
		return msg;
	}
	public String printError(String msg) {
		System.out.println("[서비스 실패] " + msg + "실패");
		System.out.println("======================");
		return msg;
	}

	public String checkMsg(String msg) {
		System.out.println("정말 " + msg + "하시겠습니까?");
		return msg;
	}

	public Student modifyStudentInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("변경할 1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("변경할 2차 점수 : ");
		int score2 = sc.nextInt();
		Student student = new Student(name, score1, score2);
		return student;
	}



	
}

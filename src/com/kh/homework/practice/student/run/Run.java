package com.kh.homework.practice.student.run;

import java.util.List;

import com.kh.homework.practice.student.controller.StudentController;
import com.kh.homework.practice.student.model.vo.Student;
import com.kh.homework.practice.student.view.StudentView;

public class Run {

	public static void main(String[] args) {
		StudentView sView = new StudentView();
		StudentController sCtrl = new StudentController();
		Student std = null;
		int choice = 0;
		String name = "";
		int index = 0;
		
		end:
		for(;;) {
			choice = sView.printMenu1();
			switch(choice) {
			case 1: 
				// 1. 학생 정보 입력
				std = sView.inputInfo();
				sCtrl.addInfo(std);
				break;
				
			case 2: 
				// 2. 학생 정보 이름 검색
				name = sView.inputStudentName("검색");
				List<Student> searchList = sCtrl.searchStudentByName(name);
				sView.printAllStudentInfo(searchList);
				sView.printSuccess("검색한 " + name + " 학생 조회");
				break;
				
			case 3: 
				// 3. 학생 정보 수정(이름)
				// 수정할 학생 이름 입력받기
				name = sView.inputStudentName("수정");
				// 존재유무 확인
				index = sCtrl.searchOneByName(name);
				if(index == -1) {
					sView.printError("존재하지 않습니다.");
					break;
				}
				// 수정할 정보 받기
				std = sView.modifyStudentInfo();
				// 수정하기
				sCtrl.updateStudent(index, std);
				sView.printSuccess("수정 ");
				break;
				
			case 4: 
				// 4. 학생 정보 전체 출력
				List<Student> allList = sCtrl.printStudentList();
				sView.printAllStudentInfo(allList);
				sView.printSuccess("전체 조회");
				break;
				
			case 5: 
				// 5. 학생 정보 삭제(이름)
				name = sView.inputStudentName("삭제");
				index = sCtrl.searchOneByName(name);
				if(index == -1) {
					sView.printError("존재하지 않습니다.");
					break;
				}
				sCtrl.removeStudent(index);
				sView.printSuccess(name + " 학생의 정보 삭제 ");
				break;
				
			case 6: 
				// 6. 학생 정보 전체 삭제
				sCtrl.removeStdInfoAll();
				sView.printSuccess("전체 정보 삭제 ");
				break;
				
			case 7: 
				// 7. 재평가 대상 여부 확인
				
				break;
				
			case 8: 
				// 8. 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				break end;
				
			default : 
				// 에러 메시지
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}

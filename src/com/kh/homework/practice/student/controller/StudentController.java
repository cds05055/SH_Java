package com.kh.homework.practice.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.homework.practice.student.model.vo.Student;

public class StudentController {
	List<Student> sList;
	public StudentController() {
		sList = new ArrayList<Student>();
	}
	
	/**
	 * sList에 입력한 학생 정보 추가
	 * @param student
	 */
	public void addInfo(Student student) {
		sList.add(student);
	}
	
	/**
	 * sList에 있는 학생 리스트 출력
	 * @return sList
	 */
	public List<Student> printStudentList() {
		return sList;
	}
	
	/**
	 * 검색한 이름을 받아 sList에 있다면 findList에 넣고 리턴
	 * @param name
	 * @return findList
	 */
	public List<Student> searchStudentByName(String name) {
		List<Student> findList = new ArrayList<Student>();
		for(Student sOne : sList) {
			if(sOne.getName().equals(name)) {
				findList.add(sOne);
			}
		}
		return findList;
	}
	
	/**
	 *  존재유무 확인
	 * @param name
	 * @return i or -1
	 */
	public int searchOneByName(String name) {
		for(int i = 0; i < sList.size(); i++) {
			Student student = sList.get(i);
			if(student.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 *  검색한 이름만 삭제
	 * @param i
	 */
	public void removeStudent(int i) {
		sList.remove(i);
	}
	
	/**
	 *  전체 삭제
	 */
	public void removeStdInfoAll() {
		for(int i = sList.size(); i > 0; i--) {
			sList.remove(i-1);
		}
	}
	
	/**
	 * 존재유무를 확인한 index번째 학생의 정보를
	 * student에 입력된 변경값으로 다시 set
	 * @param index
	 * @param student
	 */
	public void updateStudent(int index, Student student) {
		sList.set(index, student);
	}

}

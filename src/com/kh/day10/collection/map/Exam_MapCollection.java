package com.kh.day10.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class Exam_MapCollection {
	public static void main(String[] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();
		stdMap.put("one", new Student("타이타닉", 44, 66));
		stdMap.put("two", new Student("자바", 88, 44));
		
		System.out.println("첫번째 학생 " + stdMap.get("one"));
		System.out.println("두번째 학생 " + stdMap.get("two"));
	}
	
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "손풍기");
		objMap.put("price", "1500");
		objMap.put("isGood", true);
		System.out.println("상품 이름은 " + objMap.get("name"));
		System.out.println("가격은 " + objMap.get("price")+ "원");
		String result = (boolean)objMap.get("isGood") ? "추천" : "비추천";
		System.out.println("추천 여부는 " + result);
	}
	
	public void mapExample() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");
		System.out.println("저장된 데이터의 수 : " + map.size());
		System.out.println("02를 누르면 서울이 나옵니다 : " + map.get("02"));
		System.out.println("031을 누르면 경기도가 나옵니다 : " + map.get("031"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력 : ");
		String regionCode = sc.next();
		System.out.print("입력하신 지역번호에 대한 지역 : " + map.get(regionCode));
	}
}


//=== === 메인 메뉴 === ===
//1. 마지막 위치에 곡 추가
//2. 첫 위치에 곡 추가
//3. 전체 곡 목록 출력
//4. 특정 곡 검색
//5. 특정 곡 삭제
//6. 특정 곡 정보수정
//7. 곡명 오름차순 정렬
//8. 곡명 내림차순 정렬
//9. 가수명 오름차순 정렬
//10. 가수명 내림차순 정렬
//0. 종료
//메뉴 선택 >> 1
//마지막 위치에 곡 추가
//곡명 : 보고싶다
//가수명 : 김범수
//[서비스 성공] : 추가 성공!

//메뉴 선택 >> 3
//====== 전체 곡 목록 출력 ======
//1번째 노래 -> 곡명 : 보고싶다, 가수명 : 김범수
//[서비스 성공] : 조회 성공!

//메뉴 선택 >> 2
//첫 위치에 곡 추가
//곡명 : i am
//가수명 : 아이브
//[서비스 성공] : 추가 성공!

//메뉴 선택 >> 4
//검색할 곡 입력 : i am
//====== 전체 곡 목록 출력 ======
//1번째 노래 -> 곡명 : i am, 가수명 : 아이브
//[서비스 성공] : 조회 성공!

//메뉴 선택 >> 5
//삭제할 곡 입력 : 가슴아파도
//[서비스 성공] : 삭제 성공!

//메뉴 선택 >> 6
//수정할 곡 입력 : 보고싶다
//수정할 곡명 입력 : 안보고싶다
//수정할 가수명 입력 : 김범목
























package com.kh.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MusicRun {
	public static void main(String[] args) {
		Map<Object, Music> songMap = new HashMap<Object, Music>();
		MusicFunction musicFunc = new MusicFunction();
		Scanner sc = new Scanner(System.in);
		
		end:
		for(;;) {
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
			//메뉴 선택 >>
			int choice = musicFunc.printMenu();
			switch(choice) {
			case 0 : 
				System.out.println("프로그램이 종료되었습니다.");
				break end;
				
			case 1 : 
				//메뉴 선택 >> 1
				//마지막 위치에 곡 추가
				//곡명 : 보고싶다
				//가수명 : 김범수
				//[서비스 성공] : 추가 성공!
				musicFunc.insertSongToLast();
				break;
				
			case 2 : 
				//메뉴 선택 >> 2
				//첫 위치에 곡 추가
				//곡명 : i am
				//가수명 : 아이브
				//[서비스 성공] : 추가 성공!
				musicFunc.insertSongToFirst();
				break;
			
			case 3 : 
				//메뉴 선택 >> 3
				//====== 전체 곡 목록 출력 ======
				//1번째 노래 -> 곡명 : 보고싶다, 가수명 : 김범수
				//[서비스 성공] : 조회 성공!
				musicFunc.printAllSongs();
				break;
				
			case 4 : 
				//메뉴 선택 >> 4
				//검색할 곡 입력 : i am
				//====== 전체 곡 목록 출력 ======
				//1번째 노래 -> 곡명 : i am, 가수명 : 아이브
				//[서비스 성공] : 조회 성공!
				musicFunc.searchSong();
				break;
				
			case 5 : 
				//메뉴 선택 >> 5
				//삭제할 곡 입력 : 가슴아파도
				//[서비스 성공] : 삭제 성공!
				musicFunc.removeSong();
				break;
				
			case 6 : 
				//메뉴 선택 >> 6
				//수정할 곡 입력 : 보고싶다
				//수정할 곡명 입력 : 안보고싶다
				//수정할 가수명 입력 : 김범목
				musicFunc.modifySong();
				break;
				
			case 7 : 
				
				break;
				
			case 8 : 
				
				break;
				
			case 9 : 
				
				break;
				
			case 10 : 
				
				break;
			}



		}
	}
}

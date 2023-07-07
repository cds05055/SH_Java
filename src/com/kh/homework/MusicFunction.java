package com.kh.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	Scanner sc = new Scanner(System.in);
	List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	public int printMenu() {
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >>");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertSongToLast() {
		//메뉴 선택 >> 1
		//마지막 위치에 곡 추가
		//곡명 : 보고싶다
		//가수명 : 김범수
		//[서비스 성공] : 추가 성공!
		sc.nextLine();
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String songName = sc.nextLine();
		System.out.print("가수명 : ");
		String singerName = sc.nextLine();
		Music music = new Music(songName, singerName);
		mList.add(music);
		System.out.println("[서비스 성공] : 추가 성공!");
	}
	
	public void insertSongToFirst() {
		//메뉴 선택 >> 2
		//첫 위치에 곡 추가
		//곡명 : i am
		//가수명 : 아이브
		//[서비스 성공] : 추가 성공!
		sc.nextLine();
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String songName = sc.nextLine();
		System.out.print("가수명 : ");
		String singerName = sc.nextLine();
		Music music = new Music(songName, singerName);
		mList.add(0, music);
		System.out.println("[서비스 성공] : 추가 성공!");
	}
	
	public void printAllSongs() {
		//메뉴 선택 >> 3
		//====== 전체 곡 목록 출력 ======
		//1번째 노래 -> 곡명 : 보고싶다, 가수명 : 김범수
		//[서비스 성공] : 조회 성공!
		
		System.out.println("====== 전체 곡 목록 출력 ======");
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
				System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n"
						, (i+1)
						, music.getSongName()
						, music.getSingerName());
				System.out.println("[서비스 성공] : 조회 성공!");
		}
	}
	
	public void searchSong() {
		//메뉴 선택 >> 4
		//검색할 곡 입력 : i am
		//====== 특정 곡 검색 ======
		//1번째 노래 -> 곡명 : i am, 가수명 : 아이브
		//[서비스 성공] : 조회 성공!
		sc.nextLine();
		System.out.print("검색할 곡 입력 : ");
		String searchName = sc.nextLine();
		System.out.println("====== 특정 곡 검색 ======");
		for(Music music : mList) {
			if(music.getSongName().equals(searchName)) {
				System.out.printf("검색 결과 -> 곡명 : %s, 가수명 : %s\n"
						, music.getSongName()
						, music.getSingerName());
				System.out.println("[서비스 성공] : 조회 성공!");
				break;
			} else {
				System.out.println("검색한 결과가 없습니다.");
				break;
			}
		}
	}
	
	public void removeSong() {
		//메뉴 선택 >> 5
		//삭제할 곡 입력 : 가슴아파도
		//[서비스 성공] : 삭제 성공!
		
		sc.nextLine();
		System.out.print("삭제할 곡 입력 : ");
		String searchName = sc.nextLine();
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getSongName().equals(searchName)) {
				// mList에서 삭제
				mList.remove(i);
				System.out.println("[서비스 성공] : 삭제 성공!");
				break; // 삭제 후 for문 탈출
			}
		}
	}

	public void modifySong() {
		//메뉴 선택 >> 6
		//수정할 곡 입력 : 보고싶다
		//수정할 곡명 입력 : 안보고싶다
		//수정할 가수명 입력 : 김범목
		
		sc.nextLine();
		System.out.print("수정할 곡 입력 : ");
		String searchName = sc.nextLine();
		System.out.print("수정할 곡명 입력 : ");
		String modSongName = sc.nextLine();
		System.out.print("수정할 가수명 입력 : ");
		String modSingerName = sc.nextLine();
		Music modMusic = new Music(modSongName, modSingerName);
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getSongName().equals(searchName)) {
				// mList에서 수정
				mList.set(i, modMusic);
				System.out.println("[서비스 성공] : 수정 성공!");
				break; // 수정 후 for문 탈출
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}

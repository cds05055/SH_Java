package com.kh.homework;

public class Music {
	String songName;
	String singerName;
	
	public Music() {}
	public Music(String songName, String singerName) {
		this.songName = songName;
		this.singerName = singerName;
	}
	
	// get
	public String getSongName() {
		return songName;
	}
	public String getSingerName() {
		return singerName;
	}
	
	// set
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	@Override
	public String toString() {
		return "곡명 : " + this.songName + ", 가수명 : " + this.singerName;
	}
}

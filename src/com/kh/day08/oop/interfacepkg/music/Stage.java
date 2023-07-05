package com.kh.day08.oop.interfacepkg.music;

public class Stage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musician musician = new Musician();
		musician.tunning(new Drum());
		musician.tunning(new Guitar());
		musician.tunning(new Piano());
		musician.play(new Drum());
		musician.play(new Guitar());
		musician.play(new Piano());
	}

}

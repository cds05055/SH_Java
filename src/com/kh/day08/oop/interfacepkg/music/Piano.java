package com.kh.day08.oop.interfacepkg.music;

public class Piano implements Instrument{

	@Override
	public void tunning() {
		// TODO Auto-generated method stub
		System.out.println("C D E F G A B C");
	}

	@Override
	public void playInstrument() {
		// TODO Auto-generated method stub
		System.out.println("미 레 도 레 미 미 미");
	}

}

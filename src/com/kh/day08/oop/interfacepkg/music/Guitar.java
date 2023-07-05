package com.kh.day08.oop.interfacepkg.music;

public class Guitar implements Instrument{

	@Override
	public void tunning() {
		// TODO Auto-generated method stub
		System.out.println("E A D G B E");
	}

	@Override
	public void playInstrument() {
		// TODO Auto-generated method stub
		System.out.println("E D C D E E E");
	}
	
}

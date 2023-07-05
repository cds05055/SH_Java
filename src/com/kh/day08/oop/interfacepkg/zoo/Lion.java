package com.kh.day08.oop.interfacepkg.zoo;

public class Lion extends Animal implements FoodInterface{

	public String animalFood() {
		return "gazel";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}
}

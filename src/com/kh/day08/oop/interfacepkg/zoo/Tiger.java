package com.kh.day08.oop.interfacepkg.zoo;

public class Tiger extends Animal implements FoodInterface{

	public String animalFood() {
		return "beef";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}
}

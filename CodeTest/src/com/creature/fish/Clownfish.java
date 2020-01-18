package com.creature.fish;

public class Clownfish extends fish {

	@Override
	public void size() {
		System.out.println("Clownfish are small and colourful (orange)");

	}

	@Override
	public boolean sing() {
		System.out.println("Clownfish make jokes");
		return false;

	}

}

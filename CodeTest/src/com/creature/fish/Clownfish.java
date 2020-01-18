package com.creature.fish;

import com.creature.Animal;

public class Clownfish extends fish implements Animal {

	@Override
	public void size() {
		System.out.println("Clownfish are small and colourful (orange)");
		
	}
	
	@Override
	public void sing() {
		System.out.println("Clownfish make jokes");
		
	}

	

}

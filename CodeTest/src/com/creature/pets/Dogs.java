package com.creature.pets;

import com.creature.Animal;

public class Dogs implements Animal {

	@Override
	public boolean sound() {
		System.out.println("Woof Woof");
		return true;

	}
	
	@Override
	public boolean walk() {
		
		return true;

	}

}

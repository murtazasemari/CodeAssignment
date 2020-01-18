package com.creature.pets;

import com.creature.Animal;

public class Cats implements Animal {

	@Override
	public boolean sound() {
		System.out.println("Meow");
		return true;

	}

}

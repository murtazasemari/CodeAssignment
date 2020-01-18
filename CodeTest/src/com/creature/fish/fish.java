package com.creature.fish;

import com.creature.Animal;

public class fish extends SeaCreature {

	@Override
	public void swim() {
		System.out.println("Hey Look I can Swim");

	}

	@Override
	public Animal getFish(String shark) {

		if (shark.equalsIgnoreCase("SHARK")) {
			return new Shark();
		} else if (shark.equalsIgnoreCase("CLOWN")) {
			return new Clownfish();
		}
		return null;
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}
}

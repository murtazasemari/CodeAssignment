package com.creature.fish;

import com.creature.Animal;

public class fish extends SeaCreature {

	@Override
	public boolean swim() {
		System.out.println("Hey Look I can Swim");
		return true;

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

}

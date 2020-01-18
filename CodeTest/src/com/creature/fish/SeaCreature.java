package com.creature.fish;

import com.creature.Animal;

public abstract class SeaCreature implements Animal {

	public boolean walk() {
		System.out.println("Sorry I cannot Walk");
		return false;

	}

	public boolean sing() {
		System.out.println("Sorry I cannot Sing");
		return false;

	}

	public abstract void swim();

	public abstract Animal getFish(String size);

}

package com.creature.fish;

import com.creature.Animal;

public abstract class SeaCreature implements Animal {

	public void walk() {
		System.out.println("Sorry I cannot Walk");

	}

	public void sing() {
		System.out.println("Sorry I cannot Sing");

	}
	

	public void sound() {		
	}

	public void size() {		
	}

	public abstract void swim() ;
	abstract Animal getSize(String size);

}

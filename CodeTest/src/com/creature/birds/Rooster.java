package com.creature.birds;

public class Rooster extends Chicken {
	
	public boolean fly() {
		System.out.println("Rooster : I cannot Fly, My Wings are Clipped :-(");
		return false;
		
	}

	@Override
	public boolean sound() {
		System.out.println("Rooster Says Cock-a-doodle-doo");
		return true;
		
	}
}

package com.creature.birds;

public class Rooster extends Chicken {
	
	public void fly() {
		System.out.println("Rooster : I cannot Fly, My Wings are Clipped :-(");
		
	}

	@Override
	public void sound() {
		System.out.println("Rooster Says Cock-a-doodle-doo");
		
	}
}

package com.creature.birds;

import com.creature.Bird;

public class Chicken implements Bird {

	@Override
	public boolean sound() {
		System.out.println("Chicken Says Cluck, cluck");
		return true;

	}

	@Override
	public boolean fly() {
		System.out.println("Chicken : I cannot Fly, My Wings are Clipped :-(");
		return false;

	}
	
	@Override
	public boolean walk() {
		return true;
	}

}

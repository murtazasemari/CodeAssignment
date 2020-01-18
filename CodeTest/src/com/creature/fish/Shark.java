package com.creature.fish;

import com.creature.Animal;

public class Shark  extends fish implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void size() {
		System.out.println("Sharks are large and grey");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Sharks eat other fish");
		
	}

}

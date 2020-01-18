package com.creature.birds;

import com.creature.Bird;

public class Chicken implements Bird {

	@Override
	public void sound() {
		System.out.println("Chicken Says Cluck, cluck");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Chicken : I cannot Fly, My Wings are Clipped :-(");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

}

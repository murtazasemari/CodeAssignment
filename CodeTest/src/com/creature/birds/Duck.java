package com.creature.birds;

import com.creature.Bird;

public class Duck implements Bird {

	@Override
	public boolean sound() {
		System.out.println("Duck Says Quack, quack");
		return true;

	}

	@Override
	public boolean swim() {
		System.out.println("Duck : Hey Look I can Swim");
		return true;
	}

}
package com.creature.fish;

import com.creature.Bird;

public class Dolphin implements Bird {

	@Override
	public boolean fly() {
		System.out.println("Sorry I cannot Fly");
		return false;

	}

	@Override
	public boolean swim() {
		System.out.println("Hey I am good Swimmer");
		return true;

	}


}

package com.creature.birds;

import com.creature.Bird;

public class Butterfly implements Bird {

	@Override
	public boolean fly() {
		return true;

	}

	@Override
	public boolean sound() {
		return false;

	}
}

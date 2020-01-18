package com.main;

import com.creature.birds.Chicken;
import com.creature.birds.Duck;
import com.creature.birds.Rooster;

public class Solution {
	public static void main(String[] args) {
		getBirds();
		
	}

	private static void getBirds() {
	
	//Chicken Sound and cannot swim
	Chicken ck = new Chicken();
	ck.sound();
	ck.fly();
	
	//Duck Sound and can swim
	Duck dk = new Duck();
	dk.sound();
	dk.swim();
	
	ck = new Rooster();
	ck.sound();
		
	}
}	
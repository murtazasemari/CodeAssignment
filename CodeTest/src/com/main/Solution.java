package com.main;

import com.creature.Bird;
import com.creature.birds.Chicken;
import com.creature.birds.Duck;
import com.creature.birds.Parrots;
import com.creature.birds.Rooster;
import com.creature.birds.TalkingParrots;

public class Solution {
	public static void main(String[] args) {
		getBirds();
		
	}

	private static void getBirds() {
	
	//Chicken Sound and cannot swim
	Bird b1= new Chicken();
	b1.sound();
	b1.fly();
	
	
	//Duck Sound and can swim
	b1 = new Duck();
	b1.sound();
	b1.swim();
	
	b1 = new Rooster();
	b1.sound();
	
	TalkingParrots p1 = new TalkingParrots();
	p1.getSound("dogs");
	p1.getSound("cats");
	p1.getSound("rhooster");
	
		
	}
}	
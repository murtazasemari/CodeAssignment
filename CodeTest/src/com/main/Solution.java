package com.main;

import com.creature.Bird;
import com.creature.birds.Chicken;
import com.creature.birds.Duck;
import com.creature.birds.Rooster;
import com.creature.birds.TalkingParrots;
import com.creature.fish.Clownfish;
import com.creature.fish.SeaCreature;
import com.creature.fish.Shark;
import com.creature.fish.fish;

public class Solution {
	public static void main(String[] args) {
		getBirds();

	}

	private static void getBirds() {

		// Chicken Sound and cannot swim
		Bird b1 = new Chicken();
		b1.sound();
		b1.fly();

		// Duck Sound and can swim
		b1 = new Duck();
		b1.sound();
		b1.swim();

		b1 = new Rooster();
		b1.sound();

		TalkingParrots p1 = new TalkingParrots();
		p1.getSound("dogs");
		p1.getSound("cats");
		p1.getSound("rhooster");

		// B Model fish as well as other swimming animals

		SeaCreature f1 = new fish();
		f1.swim();
		f1.walk();
		f1.sing();
		
		//B2 Shark and Clownfish
		f1 = new Shark();
		f1.size();
		f1.eat();
		
		f1= new Clownfish();
		f1.size();
		f1.sing();
		f1.eat();
		
		

	}
}
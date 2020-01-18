package com.main;

import com.creature.Animal;
import com.creature.Bird;
import com.creature.birds.Chicken;
import com.creature.birds.Duck;
import com.creature.birds.Rooster;
import com.creature.birds.TalkingParrots;
import com.creature.fish.SeaCreature;
import com.creature.fish.fish;

public class Solution {
	public static void main(String[] args) {
		getBirds();
		getFish();

	}

	private static void getFish() {
	
		System.out.println("\n----------------Model 2-----------------");
		
		// B Model fish as well as other swimming animals
		SeaCreature f1 = new fish();
		f1.swim();
		f1.walk();
		f1.sing();
		
		
		Animal ani1 = f1.getFish("SHARK");
		ani1.size();
		ani1.eat();
		ani1 = f1.getFish("CLOWN");
		ani1.size();
		ani1.eat();
		
		


	}

	private static void getBirds() {

		System.out.println("\n----------------Model 1-----------------");
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

	}
}
package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.creature.Animal;
import com.creature.Bird;
import com.creature.birds.Butterfly;
import com.creature.birds.Chicken;
import com.creature.birds.Duck;
import com.creature.birds.Parrot;
import com.creature.birds.Rooster;
import com.creature.fish.Clownfish;
import com.creature.fish.Dolphin;
import com.creature.fish.SeaCreature;
import com.creature.fish.Shark;
import com.creature.fish.fish;
import com.creature.pets.Cats;
import com.creature.pets.Dogs;

public class Solution {
	public static void main(String[] args) {
		getBirds();
		getFish();
		getButterfly();

		//getCount();

	}

	
	private static void getButterfly() {

		// D. Model animals that change their behaviour over time

		System.out.println("---------------------------Model 3 ----------------------");

		Bird b1 = new Butterfly();
		if (b1.fly()) {
			System.out.println("I can Fly");
		}

		if (b1.sound()) {
			System.out.println("Hey I can Talk");
		} else {
			System.out.println("I cannot make a sound");
		}

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

		// Reuse the Bird Interface with Dolphin
		Bird b1 = new Dolphin();
		b1.swim();

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

		Parrot p1 = new Parrot();
		p1.getSound("dogs");
		p1.getSound("cats");
		p1.getSound("rhooster");

	}
}
package com.creature.fish;

import com.creature.Animal;

public class fish extends SeaCreature {

	@Override
	public void swim() {
		System.out.println("Hey Look I can Swim");
		
	}

	@Override
	Animal getSize(String fish) {
		
		
		if(fish.equalsIgnoreCase("SHARK")){
	         return new Shark();         
	      }else if(fish.equalsIgnoreCase("CLOWN")){
	         return new Clownfish();
	      }	 
	      return null;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

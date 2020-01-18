package com.creature.birds;

import com.creature.Animal;
import com.creature.pets.Cats;
import com.creature.pets.Dogs;

public class TalkingParrots {
	
	
	public void getSound(String sound) {
		
		Animal ani1 = null; 
		switch (sound)
		{
		    case "dogs":
		    	ani1= new Dogs();
		    	 break; 
		    case "cats":
		        ani1 = new Cats();
		        break; 
		    case "rooster":
		        ani1 = new Rooster();    
		        break; 
		    default: 
                System.out.println("I am not in the mood to make a sound today");     
		}
		
		if(ani1 !=null) {
			ani1.sound();
		}
	
		
	}
	
	

}

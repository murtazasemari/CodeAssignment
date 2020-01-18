package com.creature;

public interface Bird extends Animal  {
	
	
	public default boolean fly() {
		return true;
	}
	

}

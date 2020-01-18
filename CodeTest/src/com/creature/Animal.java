package com.creature;

public interface Animal {
	
	public default boolean walk() {
		return false;
		
	}
	
	public default boolean sing() {
		return false;
		
	}
	
	public default boolean sound() {
		return false;
		
	}
	
	public default void size() {
		System.out.println("Size always Various of Animals");
	};
	
	public default void eat() {
		System.out.println("Different Animals eats Different Food");
	}
	
}
package com.inheritance;

public class Car {
	
	int speed;
	int i =10;
	String model;
	
	public Car() {
		System.out.println("empty cons");
	}
	
	public Car(int speed) {
		this.speed=speed;
		System.out.println("one arg cons");
	}
	
}

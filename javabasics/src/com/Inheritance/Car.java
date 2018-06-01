package com.Inheritance;

public class Car {
	
	String regnum;
	int engsize;
	int speed;
	
	public Car() {
		
		System.out.println("empty arg cons");
	}
	public Car(int speed) {
		this();
		this.speed=speed;
		System.out.println("one arg cons");
	}
	
	public static void main(String[] args) {
		Car c1=new Car();
	}

}
  
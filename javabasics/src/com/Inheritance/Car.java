package com.Inheritance;

import com.basic.Employee;

public class Car {
	
	String regnum;
	int engsize;
	int speed;
	
	// import package
	public void getSpeed(Employee e1) {
		
	}
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
  
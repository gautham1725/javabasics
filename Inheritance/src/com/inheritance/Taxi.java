package com.inheritance;

public class Taxi extends Car {
	
	
	public Taxi() {
		System.out.println("taxi cons");
	}
	
	public Taxi(int i) {
		//super(i);
		this();
		System.out.println("taxi one arg cons");
	}
	
	public static void main(String[] args) {
		
		Taxi taxi=new Taxi(23); 
	}
	

}

package com.basic;

public class Car {
	
	String Model;
	double speed;
	
	public Car(){
		
	}
	
	
	public String getModel() {
		return Model;
	}


	public String setModel(String model) {
		this.Model = model;
		return Model;
	}


	public double getSpeed() {
		return speed;
	}


	public double setSpeed(double speed) {
		this.speed = speed;
		return  speed;
	}


	public boolean start() { 
		return true;
		
	}
	public double accelerate(double speed) {
		speed +=10;
		return speed;
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setModel("BMW");
		double speed1=car1.setSpeed(250);
		car2.setModel("AUDI");
		double speed2=car2.setSpeed(350);
		
		speed1=car1.accelerate(speed1);
		speed2=car2.accelerate(speed2);
		
		car1.setSpeed(speed1);
		car2.setSpeed(speed2);
		
		speed2=car2.accelerate(speed2);
		car2.setSpeed(speed2);
		
		System.out.println("Car_1"+car1.getModel()+"\n"+"Speed:"+car1.getSpeed());
		System.out.println("Car_2"+car2.getModel()+"\n"+"Speed:"+car2.getSpeed());
	}

}

package com.inheritance;

public class ThreeDimensional extends Shape {
	
	@Override
	public void printShape(String shape) {
		// TODO Auto-generated method stub
		super.printShape(shape);
	}
	
	public static void main(String[] args) {
		ThreeDimensional threeDimensional = new ThreeDimensional();
		
		threeDimensional.printShape("sphere");
		
		
		
	}
	
	

}

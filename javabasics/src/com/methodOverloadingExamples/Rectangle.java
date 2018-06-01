package com.methodOverloadingExamples;

public class Rectangle {
	
	float length;
	float width;
	
	
	public Rectangle(float length,float width) {
		 
			if(length>0&&length<20.0 && width>0&&width<0) { 
		this.length=length;
		this.width=width;
			}
		else {
		System.out.println("you were violating the limits");
		
	}
	}
	
	public float perimeter(){
		float perimeter= 4*length;
		return perimeter;
	}
	
	public float area() {
		float area= length*width;
		return area;
	}
	
	public static void main(String[] args) {
		
		Rectangle g1= new Rectangle(5,10);
		Rectangle g2= new Rectangle(10,20);
		
		//g1.setlength(5);
		//g1.setwidth(10);
		
		//g2.setlength(10);
		//g.setwidth(20);
		System.out.println(g1.perimeter());
		System.out.println(g1.area());
		
		System.out.println(g2.perimeter());
		System.out.println(g2.area());
		
	}
	
	
	

}

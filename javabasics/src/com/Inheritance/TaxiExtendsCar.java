package com.Inheritance;

public class Taxi extends Car  {
	
	// public class Taxi {
			
			int cabnum;
			
		           public Taxi() {
				
				System.out.println("empty taxi arg cons");
			}
		        	public Taxi(int i) {
				//this.speed=speed;
				    System.out.println("two taxi arg cons");
			}
		        	
		        public static void main(String[] args) {
		        	Car c1= new Car(6);
		        	Taxi t1=new Taxi();
		        }
			
		}

	


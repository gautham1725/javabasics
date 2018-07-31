package com.clone;

public class CloneExample implements Cloneable {
	
	public CloneExample() {
		
	}
	
	public static void main(String[] args) {
		
		CloneExample ceone = new CloneExample();
		try {
			
			CloneExample cetwo = (CloneExample)ceone.clone();
			
			System.out.println(ceone.hashCode()+"==="+cetwo.hashCode());
			
		}
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}

	}

}

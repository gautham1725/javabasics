package com.enums;

public class TestEnums {
	public static void main(String[] args) {
		
		
		Level l1= Level.HIGH;
		System.out.println(l1.getClass().getName());
		System.out.println(l1.levelcode);
		System.out.println(l1.getLevelCode());
		
		Level l2[] = Level.values();
		for(int i=0;i<l2.length;i++) {
		System.out.println(l2);
	}

   }
}

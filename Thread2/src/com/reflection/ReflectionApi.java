package com.reflection;
import java.lang.reflect.Constructor;

public class ReflectionApi {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("com.java.lang.Employee");
			
			
			Constructor cons[] = cls.getDeclaredConstructor();
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}

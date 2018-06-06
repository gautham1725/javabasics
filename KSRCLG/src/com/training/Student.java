package com.training;

public class Student {
	
	public static void main(String[] args) {
		
		StudentDetails s1=new StudentDetails();
		
		s1.setId(10);
		s1.setFirstName("gowtham");
		s1.setLastName("subramanyum");
		s1.setBranch("EEE");
		s1.setSection("A");
		System.out.println(s1.toString());
		
StudentDetails s2=new StudentDetails();
		
		s2.setId(10);
		s2.setFirstName("gowtham1");
		s2.setLastName("subramanyum");
		s2.setBranch("EEE");
		s2.setSection("A");
		System.out.println(s2.toString());
	}
	

}

package com.collectionsAPI;

import java.util.HashSet;

public class SetProblems {

	String country;
	HashSet h1 = new HashSet<String>();
	
	public HashSet saveCountryNames(String CountryName){
		
		String arr[] = CountryName.split(",") ;
		
		for(String s : arr) {
			h1.add(s);
		}
		
		return h1;
		
				
	}
	
	public static void main(String[] args) {
		
		SetProblems s1 = new SetProblems();
		HashSet<String> h2 = s1.saveCountryNames("india , russia , england , japan , china ");

	
		for(Object s2 : h2) {
			System.out.println(s2);
		}
		
	}

}

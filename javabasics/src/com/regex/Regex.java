package com.regex;

import java.util.*;

public class Regex {

	public static void main(String[] args) {
		
		String input = "123goets234jbf99877kdnkj9y7yhjfhnlk";
		String regex = "[0-9]+";
		String input1 = "123456789 ";
		
	//	System.out.println(input.replaceAll("[^0-9]+", ""));
		
	//	System.out.println(input.replaceAll("[\\D]+", ""));
		
	//	System.out.println(input.replaceAll("[^A-Za-z]", ""));
		
	//	System.out.println(input.replaceAll("[0-9]+", ""));
		
	//	System.out.println(input1.matches("[0-9]+"));
		
		
		String any = ".*";
		String one = "hello";
		String two = "123";
		String three = "!@#$%";
		
		System.out.println(one.matches(any));
		System.out.println(two.matches(any));
		System.out.println(three.matches(any));

	}

}

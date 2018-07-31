package com.password;

import java.util.Scanner;

public class WeightOfString {

	public int weight(String input1){
		
		
		String i1Upper = input1.toUpperCase();
		int length1 = i1Upper.length();
		int sum = 0;
		int input2 = 0;
		
		for(int i=0; i<length1-1; i++){
			char letter = i1Upper.charAt(i);
				if(Character.isAlphabetic(letter)){
					if(input2 == 0)
					sum += (int) (letter - 64);
				}
		}
		return sum;
	}


	public static void main(String[] args) {
		WeightOfString w1 = new WeightOfString();
		Scanner s1 = new Scanner(System.in);
		String s = s1.nextLine();
		
		System.out.println(w1.weight(s));
	}

}

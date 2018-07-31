package com.password;

public class SecondWordUpperCase {

	public static void main(String[] args) {
		String input1 = "Hello";
		
		String[] arr = input1.split(" ");
		
		int len = arr.length;
		
		if(len<2){
			
			System.out.println("LESS");
		}else{
			
			String result = arr[1].toUpperCase();

			System.out.println(result);
			
			}

	}

}


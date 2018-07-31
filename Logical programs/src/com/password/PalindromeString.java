package com.password;

public class PalindromeString {

	public static void main(String[] args) {
		
		String input1="madam";
		String result = "";
		int len = input1.length();
		
		//input1 = input1.toUpperCase();
		for(int i=len-1; i>=0; i--){
			result = result + input1.charAt(i)+"";
		}
		System.out.println(result);
	
	if(input1.equalsIgnoreCase(result)==true){
		System.out.println("2");
	}else{
		System.out.println("1");
	}
	}

}

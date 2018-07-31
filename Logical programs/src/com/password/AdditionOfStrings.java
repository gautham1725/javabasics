package com.password;

import java.util.Scanner;

public class AdditionOfStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		
		int len1 = input1.length();
		int len2 = input2.length();
		
		int diff = 0;
		if(len1 > len2) {
			diff = len1 - len2;
			for(int i=0; i<diff; i++) {
				input2 = "0"+input2;
			}
		}else if(len1 < len2) {
			diff = len2 - len1;
			for(int i=0; i<diff; i++) {
				input1 = "0"+input1;
			}
		}
		
		String result="";
		
		int i,j;
		int carry=0,temp=0;
		
		for( i=input1.length()-1, j=input2.length()-1; i>=0 && j>=0 ; i--,j-- ) {
			
		//	System.out.println(i);
		//	System.out.println(j);
			
			int a = Integer.parseInt(input1.charAt(i)+"");
			int b = Integer.parseInt(input2.charAt(j)+"");
			
		//	System.out.println(input1.charAt(i));
		//	System.out.println(input2.charAt(j));
			
			temp = a+b+carry;
			
			carry = 0;
			
			if(temp>9) { 
				
				temp = temp%10;
				carry = 1;
			}
			
			result = temp+(result+"");
		}
		
		System.out.println(input1);
		System.out.println(input2);
		System.out.println();
		System.out.println(result);
	}

}

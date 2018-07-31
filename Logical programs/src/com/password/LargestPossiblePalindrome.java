package com.password;

import java.util.Scanner;

public class LargestPossiblePalindrome {
	
	public static void largestPossiblePalindrome(String input1) {
		
		byte b[] = input1.getBytes();
		int freq[] = new int[100];
		
		int x=0,r=0;
		for (int i = 0; i < b.length; i++) {
			r = b[i];
			freq[r]++;
			x++;
		}

		int count =0;
		int flag=0;
		
		for(int i=0; i<freq.length; i++) { 
			
		if(freq[i] == 2 ) {
			count++;
		}else if(freq[i] == 4) {
			count = count+2;
		}
		else if(freq[i] == 1) 
		{
			flag++;
		}
		
	 }
		int result = 0;
		
		if(count < 1 ) {
			result = -1;
		}
		else if ( flag >= 1 ) {
			result = (count*2) + 1;
		}
		else if( flag == 0 ) {
			result = (count*2);
		}
		
		System.out.println(result);
   	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String input1 = sc.next().toUpperCase();
		largestPossiblePalindrome(input1);

	}

}

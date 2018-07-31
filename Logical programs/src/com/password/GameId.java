package com.password;

import java.util.Scanner;

public class GameId {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String secondName = sc.next();
		int pin = sc.nextInt();
		int N = sc.nextInt();
		char c=0,d=0;
		String smallName = null ;
		String largeName = null ;
		
		String output = "";
		
		if(firstName.length() != secondName.length()) 
		{
		if(firstName.length() < secondName.length()) {
			smallName = firstName;
			largeName = secondName;
		}else if(firstName.length() > secondName.length()) {
			smallName = secondName;
			largeName = firstName;
		}
		}else if(firstName.length() == secondName.length())
		{
			for(int i=0; i<firstName.length();i++) {
				
				if( (int)firstName.charAt(i)  > (int)secondName.charAt(i) ){
					smallName = firstName;
					largeName = secondName;
				}else {
					smallName = secondName;
					largeName = firstName;
				}
					
			}
		}
		
		char b = smallName.charAt(smallName.length() - 1);
		String pin2 = ""+pin;
		
		
		if(pin2.length() >= N) {
			 c = pin2.charAt(N - 1);
			 d = pin2.charAt(pin2.length() - N );
		}
		
		
		String result = b+largeName;
		
		
		for(int i=0;i<result.length();i++)   {
			if( Character.isUpperCase(result.charAt(i)) )  {
			     output = output+""+(char) ( (int)result.charAt(i) + 32 );    
			}
			else if( Character.isLowerCase(result.charAt(i)) )  {
				 output = output+( ""+result.charAt(i) ).toUpperCase();
			}
			
		}
		
	        if(pin2.length() < N) {
	        	System.out.println("ERROR");
	        }else {
			System.out.println(output+c+d);
	        }
		
		
	}
}

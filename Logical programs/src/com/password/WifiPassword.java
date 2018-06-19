package com.password;
import java.util.*;

public class WifiPassword {
	
	static int num1;
	static char char2;
	static char char3;
	static int num4;
	static int num5;
	
	public static void createWifiPin(int roomNo, String lastName) { 
			char spclChar[] = {')','!', '@', '#', '$', '%', '^', '&', '*', '('  };
			 num1 =  (roomNo % 100) / 10 ;
			 int a = lastName.length();
		     char2 = lastName.charAt(a-1);
		     char3 = spclChar[(roomNo%10)];
		     	// last       middle      first
		     num4=((roomNo%10)+ num1 +(roomNo/100));
		     if(num4%2==0) {
		    	num5=num4;
		     }else if(num4>1) {
		       num5=num4-1;
		     }
		       else if(num4==1) {
		    	   num5=2;
		       }
		     
		     System.out.println(num5+" "+char3+" "+char2+" "+num1);
	} 
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int roomN0 = s1.nextInt();
		String lastName = s1.next();
		
		WifiPassword pw = new WifiPassword();
		pw.createWifiPin(roomN0, lastName);
		
	  
		}

}

package com.password;
import java.util.*;

public class StringCode{

public static String output1=""; 

public static String findStringCode(String input1) {  
	
	String strArr[] = input1.split(" ");
	int res=0;
	
	for(int i=0;i<strArr.length;i++) {
		res=0;
		  byte a[] = strArr[i].getBytes();
		  
	int len = strArr[i].length();
	
	if(len%2==1) {
		int b = a[len/2]-64;
		res+= b;
		
	}
	
	for(int j=0;j<len/2;j++) {
		int b = a[j] - a[len-(j+1)];
		res+= b;
	}
	
	if(res<0) {
		res = -res;
	}
	
	output1+=res;
	
	}
	return output1;
	
} 

public static void main(String[] args){

	Scanner s1 = new Scanner(System.in);
	String input1 = s1.nextLine();
	
	System.out.println(findStringCode(input1.toUpperCase()));

           }
}
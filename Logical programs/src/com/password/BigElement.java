package com.password;

import java.util.*;
public class BigElement {

	public static void main(String[] args) {
		
		        int input[] = new int[10];
		        
		        for(int i=0; i<input.length; i++){
		            
		            input[i] = Integer.parseInt(args[i]);
		            
		        }
		        
		        int a[] = new int[10];
		        
		        for(int i=0; i<10; i++){
		            a[i] = input[i];
		        }
		        
		        int flag = 0;
		        for(int i=0; i<a.length-1; i++){
		            if(a[i] == a[i+1]){
		                flag++;
		            }
		        }
		        
		        Arrays.sort(input);
		        
		        int max = input[input.length-1];
		        
		        int result = 0;
		        for(int i=0; i<a.length; i++){
		            if(max == a[i]){
		                result = i;
		            }
		        }
		        
		        if(flag >=1){
		        	System.out.println("0000");
		        }else{
		        	System.out.println(result);
		        }
		        
		    }
}
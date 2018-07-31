package com.password;
import java.util.*;

public class SubtractionRSP {

		public static void main(String[] args) {
		
			Scanner s1 = new Scanner(System.in);
			int input = s1.nextInt();
			int y = input;
			int r;
			int sum=0;
			do {
				int x=0;
				sum=0;
				for (int i = 0; input>0; i++) {
					r = input%10;
					input/=10;
					x++;
				}
				
				int a[] = new int[x];
				int rem ;
				for (int i = 0; i < a.length; i++) {
					rem = y%10;
					a[i] = rem;
					y/=10;
				}
				
				for (int i = 0; i < a.length-1; i++) 
					y = input;
					  
				}while(sum>9);
			
			System.out.println(sum);
			}
			
		}
		

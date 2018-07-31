package com.basic;

public class NthPrime {

	public static void main(String[] args) {
		
		int arr[]=new int[1000];
		int c=0,x=0;
		
		for(int i=2;i<=1000;i++) {
			for(int j=0;j<=i/2;j++) {
				
				if(i%j==0)
				{
					c++;
					break;
				}
				if(c<2) {
					
					arr[x]=i;
					x++;
				}
			}
		}
	}

}

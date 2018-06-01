package com.methodOverloadingExamples;

public class Array {
	public static void main(String[] args) {
		
		int i=0;
		int N=1234;
		int t =N;
		int arr[]=new int[10];
		
		while(t>0) {
			int remainder= t % 10;
			arr[i] = remainder;
			i++;
			t= t/10;
		}
	
		for(i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		
	
		
		
	}

}

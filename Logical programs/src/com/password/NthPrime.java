package com.password;

import java.util.Scanner;

public class NthPrime {

	public static int prime(int input) {
		int arr[] = new int[100];
		int count = 0,x=0;
		
		for(int i=2; i<100; i++) {
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==0) {
				arr[x] = i;
				x++;
			}
			count=0;
		}
		
	/*	for(int i=0;i<x;i++) {
			System.out.println(arr[i]);
		}
		
*/		
		return arr[input-1];
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(prime(input));

	}

}

package com.password;

import java.util.Arrays;
import java.util.Scanner;

public class MaxFreqCount {
	
	public int maxFreqCount(int input1 , int input2 ,int input3, int input4){
		
		int input[] = { input1 , input2 , input3, input4};
		
		
		int b[] = new int[100];
		int x = 0;
		for(int i=0; i<input.length; i++){
			while(input[i]>0){
			b[x] = input[i]%10;
			input[i]/=10;
				x++;
	       	}
		}
		
		int a[] = new int[x];
		
		for(int i = 0; i<x; i++){
			a[i] = b[i];
		}
		
		int freq[] = new int[10];
		int count = 0;
		
		for(int j=0; j<10; j++){
			for(int i=0; i<a.length; i++){
				if(a[i] == j){
					count++;
				}
			}
				freq[j] = count;
				count = 0;
			}
		
		int copy[] = new int[10];
		
		copy = Arrays.copyOf(freq,10);
		
		Arrays.sort(freq);
		
		int max = freq[9];
		int repeating = 0;
		
		for(int i =9; i>=0; i--){
			if(max == copy[i]){
				repeating = i;
				break;
			}
		}
		
		
		
		return repeating;
	}

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int input1 = s1.nextInt();
		int input2 = s1.nextInt();
		int input3 = s1.nextInt();
		int input4 = s1.nextInt();
		
		MaxFreqCount m1 = new MaxFreqCount();
		
		System.out.println(m1.maxFreqCount(input1, input2, input3, input4));
	}
}

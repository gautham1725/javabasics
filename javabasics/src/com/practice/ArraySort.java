package com.practice;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
	
	int a[] = {3,5,7,5,3,5,0};
	
	Arrays.sort(a);			//function to sort array in ascending
	
	int[] b = Arrays.copyOf(a, 0);
	
	for(int i=0;i<b.length-1;i++) {
		System.out.println(b[i]);
	}
	
	
	
	}

}

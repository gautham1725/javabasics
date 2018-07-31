package com.password;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b[] = new int[10];
		
		for(int i=0; i<10; i++) {
			 b[i] = sc.nextInt();
		}
		
		int temp =0,count = 0;
		
		int c[] = new int[10];
		
		for (int i = count; i>0; i--) {
			if(b[i]!=temp) {
				c[i] = b[i];
				count++;
				temp = b[i];
			}
		}
		
		
		
		Arrays.sort(c);
		
		int d[] = new int[count];
		
		int j=0;
		for (int i = 0; i<d.length; i++) {
			if(c[i]!=0) {
			d[j] = c[i];
			j++;
			}
		}
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}

package com.password;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int inpArr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			inpArr[i] = sc.nextInt();
		}
		
		int result[] = new int[N];
		int x=0,y=1;
		
		for(int i=0; i<N; i++) {
			if(inpArr[i]%2 == 0 ) {
				result[i] = inpArr[x];
				x+=2;
			}
			else if(inpArr[i]%2 != 0 ) {
				result[i] = inpArr[y];
				y+=2;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(result[i]);
		}

	}

}

package com.jnuit;

public class JunitExamples {

	public int square(int x) {
		return x*x;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int countA(String word) {
		int count =0;
		for (int i = 0; i < word.length(); i++) {
			if((word.charAt(i) == 'a') && (word.charAt(i) == 'a')){
				count++;
			}
		}
		return count;
	}
}

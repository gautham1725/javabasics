package com.practice;

public class StringBuffer1 {

	public static void main(String[] args) {
	
		StringBuffer s1 = new StringBuffer("#$%^");
		
		int a=s1.length();
		int b = s1.capacity();
	    String s=	s1.append("qwtygfdfpoliuythrgsfghgkyjgsadf").toString();
		System.out.println(s1);
        System.out.println(""+a+" "+b);
	}

}

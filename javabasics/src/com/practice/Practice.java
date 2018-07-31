package com.practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char c[] = new char[10];
			
		//	String a = String.copyValueOf(c,1,5);
			
	//		a.indexOf("hi");
			String b = "hi hello how are you";
			
			int x = b.lastIndexOf('h');
			
			String s[] = b.split(" ", 2);
			
			System.out.println(s[0]);
			System.out.println(s[1]);
		//	System.out.println(s[2]);
			//System.out.println(s[3]);
	}

}

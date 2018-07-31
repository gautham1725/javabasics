package com.practice;

public class StringExamples {

	public static void main(String[] args) {
		
		String str = "gowtham";
		StringBuffer sb = new StringBuffer(str);
				
		sb.append(" rohit ");
		sb.append("h");
		
		sb.setCharAt(1 , 'g');
		System.out.println(sb);
		int a=sb.length();
		char b[]=new char[10];
		sb.ensureCapacity(4);
		sb.getChars(0, 7, b, 0);
		
		sb.append(10);
		
		sb.insert(2, 2);
		sb.reverse();
		sb.reverse();
		
	//	sb.delete(2, 4);
		
		sb.replace(1, 2, "o");
		
		sb.deleteCharAt(2);
		
		sb.delete(14, 18);
		
		int s = sb.capacity();
		int q = sb.length();
		
		System.out.println(s);
		System.out.println(q);
		
		
	}

}

package com.basic;

public class Operators {
public static void main(String[] args)
{
		
	int count = 10;
	count++;
	System.out.println(count);
	
	int negCount = 20;
	boolean istrue = false;
	
	System.out.println(count > negCount);
	
	System.out.println(count*negCount);
	
	System.out.println(count%negCount);
	
	System.out.println(count>>2);
	System.out.println(count<<1);
	
	System.out.println(negCount==5);
	System.out.println(negCount!=5);
	
	System.out.println(6&5);
	System.out.println(10|5);
	System.out.println(10^5);
	
	System.out.println(count>10&&istrue);
	System.out.println(count>10||negCount>5);
	
	
	}
}



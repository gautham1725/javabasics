package com.basic;

public class DataTypeExample {
public static void main(String[] args)
{
	String firstName = "Gowtham";
	String lastName = "Subramaniyum";
	System.out.println(firstName +" "+ lastName);
	
	int count = 10;
	boolean istrue = false ;
	count ++ ;
	System.out.println(count);
	
	System.out.println(count > 20);
	System.out.println(count > 10);
	
	System.out.println(count >= 20);
	System.out.println(count <= 20);
	
	System.out.println(count == 20);
	System.out.println(count != 20);
	
	System.out.println(2 & 3);
	System.out.println(2 | 3);

	System.out.println(2 ^ 3);
	System.out.println( istrue & confirm() );
//	confirm() == true ;
	
}

		public static boolean confirm()
		{
			System.out.println(" confirm() called ");
			return true;
		}
	
		
}

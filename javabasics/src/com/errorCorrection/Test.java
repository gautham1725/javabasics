package com.errorCorrection;

public class Test {
	public static void main(String[] args) {
		
	int i;
		i = 1;
		while ( i <= 10 ) {
		++i;
		}


		for (double k= 0.1; k != 1.0; k += 0.1 )
		System.out.println( k );

		int n = 2;
		switch (n)
		{
		case 1:
		System.out.println( "The number is 1" );
		case 2:
		System.out.println( "The number is 2" );
		break;
		default:
		System.out.println( "The number is not 1 or 2" );
		break;
		}
	}
		
}
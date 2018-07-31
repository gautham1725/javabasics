package com.errorCorrection;

public class Looping2 {
	public static void main(String[] args) {
		
	// workseet 2 1)f	
		 
	/*	  int y;
		  int x = 1;
		  int total = 0;

		   while ( x <= 10 )
		   {
		   y = x * x;
		   System.out.println( y );
		   total += y;
		   ++x;
		   } // end while

		   System.out.printf( "Total is %d\n", total );
		   } // end main
		   
		 */
		
		int count = 1;

		while ( count <= 10 )
		{
		 System.out.println( count % 2 == 1 ? "****" : "++++++++" );
		 ++count;
		 } // end while
	
		  


	}
}



package com.basic;

public class LoopingStatements {
	public static void main (String[] args) {
		
    int count = 20;
     if ( count > 20 )
     {
     System.out.println(30);
     }
     else if (count < 20)
     {
    	 System.out.println(10);
     }
     else
    	 System.out.println(20);
     
     int responce = count > 20 ? 30 : 10;
     
     System.out.println("switch");
     int choice = 2;
     switch(choice) {
     case 1:
    	 System.out.println(1);
    	// break;
     case 2:
    	 System.out.println(2);
    	// break;
    	 default:
    		 System.out.println("default");
    		 //break;
     }
    	 
	}
}


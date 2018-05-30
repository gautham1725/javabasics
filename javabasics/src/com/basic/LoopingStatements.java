package com.basic;

public class LoopingStatements {
	public static void main (String[] args) {
		
   /* int count = 20;
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
     int choose = 2;
     switch(choose) {
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
    	 System.out.println("switch2");
    	 
    	 int gowtham = 1;
    	 switch(gowtham) {
    	 case 1:
    		 System.out.println(1);
    		 break;
    	 case 2:
    		 System.out.println(2);
    		 break;
    		 default:
    			 System.out.println(3);
    			 break;
    			 }
    	 
    	 int i = 0;
    		while ( i < 12 ) {
    		   System.out.println(i);
    		   i++;
    		}
    		
    		
    	      i = 0;
    		do {
    			System.out.println("i = " + i);
    			i++;
    		}while(i<10);
    		
    		
    		for(i=0;i<10;i++) {
    			System.out.println("for loop ="+ i);
    			
    		}
    		
    		for(i=0;i<10;i++) {
    			if(i==2) {
    				continue;
    			}
    			System.out.println("for loop ="+ i);
    				if(i==7) {
    					break;
    				}
    			}
    		*/
    		
    		
 outer :   		for(int j=0;j<5;j++) {
 lower :   			for(int k=0;k<7;k++) {
	                    if(k==5) {
	                    	continue outer ;
	                    }
	                    if(k==3) {
	                    	continue lower ;
	                    }
	                    System.out.println("j = "+j  +  " k ="+k);
	                   
    				
    			}
    		}
    			
    			
	}
}


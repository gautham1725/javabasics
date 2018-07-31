package com.password;

public class StringExamples {
	
	public static void main(String[] args) {
		
		String arr[] = {"john","johny","janardhan"};
		String a[] = new String[12];
		String b[] = new String[12];
		String c[] = new String[12];
		
		
		for(int i=0;i<arr.length;i++) {
			int length = arr[i].length();
		
	if(length%3 ==0) {
			if(length == 9) 
			{
			c[0] = arr[i].substring(0, 3);
			c[1] = arr[i].substring(3, 6);
			c[2] = arr[i].substring(6, 9);
			
	//		System.out.println(c[0]+" "+c[1]+" "+c[2]);
			
			}
			else if(length == 6) 
			{
		 
			c[0] = arr[i].substring(0, 2);
			c[1] = arr[i].substring(2, 4);
			c[2] = arr[i].substring(4, 6);
			
	//		System.out.println(c[0]+" "+c[1]+" "+c[2]);
			
			}
			
			else if(length ==3) {
				c[0] = arr[i].substring(0, 1);
				c[1] = arr[i].substring(1, 2);
				c[2] = arr[i].substring(2, 3);
				
	//	System.out.println(c[0]+" "+c[1]+" "+c[2]);
		    }
	}	
	
			
	else if(length%3 == 1) {
			
			a[0] = arr[i].substring(0, 1);
			a[1] = arr[i].substring(1, 3);
			a[2] = arr[i].substring(3, 4);
			
	//	System.out.println(a[0]+" "+a[1]+" "+a[2]);
				           }
	
			
	else if(length%3 == 2) {
			
		b[0] = arr[i].substring(0, 2);
	    b[1] = arr[i].substring(2, 3);
		b[2] = arr[i].substring(3, 5);
		
	//	System.out.println(b[0]+" "+b[1]+" "+b[2]);
                          }

			
		}
		String output1 = a[0] + b[1] + c[2];
		String output2 = a[1] + b[2] + c[0];
		String output3 = a[2] + b[0] + c[1];
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		
		
	}
}

package com.collectionsAPI;
import java.beans.ConstructorProperties;
import java.lang.annotation.Annotation;
import java.util.*;

public class QueueExamples {

	public static void main(String[] args) {
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Long.compare(o1.length(), o2.length());	// compare using lenghth 
			}                                                   // long is used
			
		};
		PriorityQueue<String> pq = new PriorityQueue<>(10,comp);
		pq.add("1223456789");
		pq.add("134567");
		pq.add("1234567567");
		pq.add("133");
		
		pq.poll();				// removes head of the queue ...
		pq.clear();   		  	// deletes all elements inside it ...

		int a= pq.size(); 		// returns size ...
  		System.out.println("a="+a);
  		
		pq.addAll(pq);			// add any collections to it ...
		
		String b = pq.element();   		// returns head of queue ...
        System.out.println("b="+b);
        
	    pq.getClass();					// returns the class ...
	    
		pq.peek();					// same as element();
		
		pq.remove();				// removes all,same as poll ...
		
	 	Object[] c = pq.toArray();   // returns as object array ...
	 	for (int i = 0; i < c.length; i++) {
	 		System.out.println("c="+c[i]);
		}
	 
	
		System.out.println(pq);
	}

}

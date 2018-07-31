package com.collectionsAPI;
import java.util.*;

public class linkListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linklist = new LinkedList<String>(); //creating linklist ...
		linklist.add("one");			
		linklist.add("two");			// adding values to the list ...
		linklist.add("three");				
		linklist.add("four");
		
		System.out.println(linklist);
		
		System.out.println("-------");
		
		linklist.offerFirst("start");	// you can add  values at head
		linklist.offerLast("End");		// and tail ...
		
		System.out.println(linklist);
		
		System.out.println("-------");
		
		Iterator itr = linklist.descendingIterator();
		while(itr.hasNext()) {						// sorts the list in descending order ...
			System.out.println(itr.next());
		}
		
		System.out.println("-------");
		
		int a = linklist.size();					// size of linklist ...
		System.out.println(a);
		
		System.out.println("-------");
		
		for(String str : linklist) {	// ( datatype refernce name : array(or)list )	
			System.out.println(str);	// prints the list in order ...	// alternate for iterator ...	
		}	
		
	}

}

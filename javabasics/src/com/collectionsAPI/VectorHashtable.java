package com.collectionsAPI;

import java.util.Hashtable;
import java.util.Vector;

public class VectorHashtable {

	public static void main(String[] args) {
		
	 Vector vec = new Vector();
	 
	 vec.add(10);
	 vec.add("gow");						// "add" method for vector
	 vec.add(12.45);
	 
	 System.out.println(vec.get(2));
	 String name = (String)vec.get(1);		// typecast needed in vector without generics
	 System.out.println(name);
	 System.out.println(vec);
	 
	 Vector<String> vect = new Vector<>();
	 
	 vect.add("ro");
	 vect.add("gow");
	 
	 String s = vect.get(0);				// no typecast needed
	 System.out.println(s);
	 System.out.println(vect);
	 
	 Hashtable<Integer, String> hash = new Hashtable<>();	//no leftside assignation needed
	 
	 hash.put(1, "hi");						//put method for hastable
	 hash.put(2, "hello");
	 
	 String a = hash.get(1);				// no typecast needed
	 System.out.println(a);
	 
	 System.out.println(hash.get(2));		// prints the value at given index
	 System.out.println(hash.values());		// prints all values without key
	 System.out.println(hash);				// prints all values with key
	 
}
}
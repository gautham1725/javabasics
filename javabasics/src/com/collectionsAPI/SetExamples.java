package com.collectionsAPI;

import java.util.*;

public class SetExamples {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
		
		List<String> list = new ArrayList<>();		
		
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("three");
	
		Set<String> setOne  = new HashSet<String>(list);  // can pass any collections as args in constructor
	    System.out.println(setOne);
	    
	    LinkedHashSet<Integer> linkset = new LinkedHashSet<Integer>();
	    LinkedHashSet<String> linkset1 = new LinkedHashSet<>();
	    
	    for(int i=0;i<1000;i++) {
	    	linkset.add(i);
	    	set.add(i);
	    }
	    
	    System.out.println(linkset);	// linkedHashSet maintains order
	    System.out.println(set);        // set maintains order for Integer
	    
	    for (int i = 0; i < 10; i++) {
	    	linkset1.add("linkset "+i);
			setOne.add("setOne  "+i);
		}
	    
	    System.out.println(linkset1);
	    System.out.println(setOne);		//doesn't maintain order for String
	    
	    TreeSet<Integer> treeset = new TreeSet<>();		// used to sort ascend
	    treeset.add(9);
	    treeset.add(1);			
	    treeset.add(6);
	    treeset.add(1);
	    treeset.add(1);
	    
	    
	    System.out.println(treeset);
	    
	    SortedSet<Integer> navi = treeset.headSet(6);
	    NavigableSet navi1 = treeset.tailSet(6, true);
	    
	   System.out.println(navi);
	   System.out.println(navi1);
	}

}

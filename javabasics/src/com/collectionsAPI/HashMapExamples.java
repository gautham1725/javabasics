package com.collectionsAPI;
import java.util.*;

public class HashMapExamples {

	public static void main(String[] args) {
		
	Map<Integer,String> map = new HashMap<Integer,String>();
	
	for(int i=0;i<10;i++) {
		map.put(i, "map"+i);		// for checking its order
	}
	
	map.put(1, "one");
	map.put(2, "two");
	map.put(3, "three");
	map.put(4, "four");		
	
	System.out.println(map);
	
	Set<Integer> set = map.keySet();		// used to return the key 
	Collection<String> collection = map.values();	// used to return the values
	
	System.out.println(set);
	System.out.println(collection);
	
	Iterator<Integer> iterKey = set.iterator();         // used to iterate,one by one
	Iterator<String> iterval = collection.iterator();	// old style .. java 8 - byte consumer
	
	while(iterKey.hasNext()) {
		System.out.println(iterKey.next()+"=="+iterval.next());		
		}
	
    Map<Integer,String> linkedmap = new LinkedHashMap<Integer,String>();
	
    linkedmap.put(1, "one");
    linkedmap.put(2, "two");
    linkedmap.put(3, "three");
    linkedmap.put(4, "four");
	
    System.out.println(linkedmap);
    
    System.out.println("---");
    
    TreeMap<Integer, String> treemap = new TreeMap<>();
	treemap.put(1, "one");
	treemap.put(3, "two");
	treemap.put(2, "three");
	treemap.put(4, "five");
		
	System.out.println(treemap);		// sort by using key value
   	}

} 
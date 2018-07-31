package com.collectionsAPI;
import java.util.*;


public class ArrayListWorking {
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList examples : "+ "\n");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1; i<5 ; i++) {
			al.add(i);
		}
		
		al.add(5);
		al.remove(2);
		
		System.out.println("contents of al = "+al);
		
		Integer[] toArr = new Integer[al.size()]; 
		
        toArr = al.toArray(toArr);
	    String s = al.toString();
		
	    System.out.println(s);
	    
	    int sum = 0;
		for(int a : toArr) {
			System.out.print(a);
			
			sum = sum+a;
		}
		
		System.out.println();
		System.out.println("sum of elements = "+sum);
		
		System.out.println("---------------------------");
		
		
		// add char array in list ...
		char c[] = { 'a' , 'b', 'c'};
		ArrayList<char[]> listChar = new ArrayList<char[]>();
		
		listChar.add(c);
		
		System.out.println(listChar.toString());
		
		//another method to add char in list ...
		ArrayList<Character> listChar2 = new ArrayList<Character>();
		
		for(int i=0; i<c.length; i++ ) {
			listChar2.add(c[i]);
		}
		
		System.out.println(listChar2);
		
		System.out.println("--------linked list-------");
		
		
		LinkedList<String> li = new LinkedList<>();
		
		for(int i=0; i<5; i++) {
			li.add(i+"abc");				// num as string
		}
		
				
		li.removeFirst();
		li.removeLast();
		
		li.addFirst("first");
		li.addLast("last");
		
		li.add(4 , "using_index");
		
		for(String a : li) {
			System.out.print(a+" ");
			}
		
		System.out.println();
		
		System.out.println("-----------hashset------------------");
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<5; i++) {
			set.add(i);				// num as string
		}
		
		System.out.println(set);
		
		System.out.println("---------DeQue-----------");
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		
		ad.push("a");
		ad.push("b");
		ad.add("c");
		ad.push("a");
		ad.push("b");
		ad.add("c");
		
	//	ad.clear();
		System.out.println(ad.pop());
		
		System.out.println(ad.peek());
		
		
		System.out.println(ad);
		
	}

}

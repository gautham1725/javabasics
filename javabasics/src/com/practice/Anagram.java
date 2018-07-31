package com.practice;

import java.util.*;


public class Anagram{
	
	public static boolean isAnagram(String word, String anagram){
		
		byte b1[] = word.toUpperCase().getBytes();
		byte b2[] = anagram.toUpperCase().getBytes();
		
		Arrays.sort(b1);
		Arrays.sort(b2);
		
		return Arrays.equals(b1,b2) ;
		
		}
		
	public static void main(String[] args){
		
		Scanner s1 = new Scanner(System.in);
		String word = s1.next();
		String anagram = s1.next();
		
		boolean ans = isAnagram(word,anagram);
		System.out.println(ans);
		}
	}
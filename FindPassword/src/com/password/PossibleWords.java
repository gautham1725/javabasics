package com.password;
import java.util.Scanner;

public class PossibleWords {
	
	
	public static void identifyPossibleWords(String input1, String input2) { 
		String c[] = new String[10];
		int x=0;
		String a[] = input1.split("_");
		String b[] = input2.split(":");
	
		
		for(int i=0;i<b.length;i++) {
			if(b[i].startsWith(a[0]) && b[i].endsWith(a[1]))
				{
				    c[x] =b[i].toUpperCase();
					x++;
				}
			}
		for( int j=0;j<x;j++)
			
				System.out.print(c[j]+":");
		}
		
	
	public static void main(String[] args) {
		
		String string1;
		String string2;
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter String 1");
		    string1 = scan.next();
			System.out.println("Enter String 2");
			string2 = scan.next();
		
	  PossibleWords pw1 = new PossibleWords();
	  pw1.identifyPossibleWords(string1, string2);
		
	 
			
		}
		
	}


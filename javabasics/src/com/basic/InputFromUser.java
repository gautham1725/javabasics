package com.basic;
import java.util.Scanner;

public class InputFromUser {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("your name ?");
		String username;
		username = sc.nextLine();
		System.out.println("hi "+username+" whatsapp ?");
		String work;
		work = sc1.nextLine();
		System.out.println("ok bye gn");
		
		

	}

}

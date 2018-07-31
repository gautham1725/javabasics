package com.arrayexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;

public class StudentInfo {
	static int count =0;
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"gow",90);
		Student s2 = new Student(2,"ro",100);
		Student s3 = new Student(3,"bhuvi",95);
		
		Student[] s = {s1,s2,s3};      // object array
		System.out.println(Arrays.toString(s));
		
		Comparator<Student> comp = new Comparator<Student>() {     //comparator method from java.util
																//Comparator<classname> refernce = new Comparator<classname>{}

			@Override
		public int compare(Student o1, Student o2) {  //classname reference , Classname reference
			/*	if(o1.getMark()>o2.getMark()) {
				return -1;					//indicates the position
				}
				if(o1.getMark()<o2.getMark()) {
				return 1;
				}
				return 0; */
				
				return Double.compare(o2.getMark(), o1.getMark());		//descending
			}
			
		};
		System.out.println("--------");
		Arrays.sort(s,comp);
		System.out.println(Arrays.toString(s));
		
		
		System.out.println("--------");
			
/*		Timer timer = new Timer();       			
		timer.schedule(new TimerTask() {				// TIMER EXAMPLES 
			
			@Override
			public void run() {
				System.out.println("called");
				count++;
				if(count==3) {													
					timer.cancel();
				}
				
			}
		}, 3000,3000);		*/
			
			
		}
	}



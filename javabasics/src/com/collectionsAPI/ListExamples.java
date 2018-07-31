package com.collectionsAPI;
import java.util.*;

import com.arrayexample.Student;

public class ListExamples {

	public static void main(String[] args) {
		

		Student s1 = new Student(1,"gow",90);
		Student s2 = new Student(2,"ro",100);
		Student s3 = new Student(3,"bhuvi",95);
		Student[] studArr = {s1,s2,s3};					// student array
		
		List<String> list = new ArrayList<>();		//should be parameterised
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		
		//.asList converts given type to list .
		List<Student> studList = new ArrayList<Student>(Arrays.asList(studArr));	// student list
		System.out.println(studList);
		
		Comparator<Student> comp = new Comparator<Student>() {
			
			public int compare(Student o1,Student o2) {
				 if(o1.getMark()>o2.getMark()) {
					 return 1;
				 }
				 else if(o1.getMark()<o2.getMark()) {
					 return -1;
				 }
			
			return 0;
		}
		};
		Collections.sort(studList, comp);	// (list , comparator name)
	
		System.out.println(studList);
	}

}

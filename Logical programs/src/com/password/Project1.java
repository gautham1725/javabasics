package com.password;
import java.util.Scanner;

public class Project1 {
	int EmpNo;
	String EmpName;
	String Department;
	String Designation;
	double salary;
	
	public Project1(int EmpNo,
	String EmpName,
	String Department,
	String Designation,
	double salary) {
		this.EmpName=EmpName;
		this.EmpNo=EmpNo;
		this.Department=Department;
		this.Designation=Designation;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
		
		Project1 e[] = new Project1[5];
		
		Project1 e1 = new Project1(1001,"fewa","fwe","few",1200.0);
		Project1 e2 = new Project1(1002,"fawa","fwe","few",1200.0);
 		e[0] = e1;
 		e[1] = e2;
 		e[2] = new Project1(1003,"fawa","fwe","few",1200.0);
 		int id = Integer.parseInt(args[0]);
 		for(int i=0; i <2; i++) {
 			if(id == e[i].EmpNo) {
 				System.out.println(e[i].Department);
 			}
 		}
	}
}

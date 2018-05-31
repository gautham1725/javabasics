package com.basic;

public class Employee {
	
	private String firstname;
	private String lastname;
	private double salary;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void salarycal()
	{
	double newsal=salary*1.1;
	System.out.println("New salary" +newsal);
}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee() ;
		
		e1.setFirstname("rohit"); 
		e1.setLastname("sharma"); 
		e1.setSalary(20000);
		//e1.salarycal();
		
		System.out.println(e1.getFirstname()+ " "+ e1.getLastname());
		e1.salarycal();
	
		}
	

}

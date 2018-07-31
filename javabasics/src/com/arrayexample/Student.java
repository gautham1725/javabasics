package com.arrayexample;

public class Student {
	
	int regId;
	String name;
	int mark;
	
	public Student(int reg,String name,int mark){
		this.regId=regId;
		this.name=name;
		this.mark=mark;
	}
	
	@Override
	public String toString() {
		return regId+" "+name+" "+mark ;
	}
	
	
	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
}

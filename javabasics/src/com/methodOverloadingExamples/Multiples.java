package com.methodOverloadingExamples;

public class Multiples {
	int var1;
	int var2;
	
	public int getVar1() {
		return var1;
	}
	public void setvar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setvar2(int var2) {
		this.var2 = var2;
	}
	
	public boolean isMultipleof(){
		if(var2%var1==0) {
			return true;
		}else {
			return false;
		}
	}		
	public static void main (String[] args) {
		
		Multiples v1= new Multiples();
		v1.setvar1(5);
		v1.setvar2(10);
		
		System.out.println(v1.isMultipleof());
	}
	}


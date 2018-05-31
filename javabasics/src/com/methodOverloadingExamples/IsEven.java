package com.methodOverloadingExamples;

public class IsEven {
	
	int var1;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	public boolean Even() {
		if(var1%2==0)
		{
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		IsEven v1=new IsEven();
		v1.setVar1(45);
		System.out.println(v1.Even());
		}
}

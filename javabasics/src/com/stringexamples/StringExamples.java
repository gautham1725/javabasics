package com.stringexamples;

public class StringExamples {

	public StringExamples() {
		
	}

	public static void main(String[] args) {
		String one = "Good";
		String oneObj = new String("Good");
		
		String two = "Good";
		
		System.out.println(one == two);
		System.out.println(one.equals(oneObj));
		
		System.out.println(one.hashCode());
		one = one + "bad";
		System.out.println(one);
		System.out.println(one.hashCode());
		
		String ss = (" hi how are you");
		String s[] = ss.split(" ");
		 for (int i = 0; i < s.length; i++) {
			
			 System.out.println(s[i]);
		 }
			 System.out.println("______");
			 
			 StringBuffer sb = new  StringBuffer();
			 sb.append("one");
			 sb.append("two");
			 sb.append("three");
			 
			 System.out.println(sb);
			
		
	
	StringBuilder sBuild = new StringBuilder();
		sBuild.append("one");
		sBuild.append("two");
		sBuild.append("three");
	 
	 System.out.println(sBuild);
	}

}

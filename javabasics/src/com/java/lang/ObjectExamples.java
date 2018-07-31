package com.java.lang;

public class ObjectExamples {

		
		int count;
		String desc;
		
		public ObjectExamples() {
			
		}
		
		public ObjectExamples(int count,String desc) {
			this.count = count;
			this.desc = desc; 
		}
		
		@Override
		public String toString() {
		return count+","+desc;
		}
		
		public static void main(String[] args) {
		 
		ObjectExamples o1 = new ObjectExamples(100,"test");
		System.out.println(o1);
		//System.out.println(o1.hashCode());
		
		
		}	
	

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}		
}

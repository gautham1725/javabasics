package com.password;

	import java.util.*;

	public class TwoMaxNum {
			
		public void printTwoNumbers(int[] nums){
			
			int FirstMax =0 ;
			int SecondMax =0 ;
			
			for(Integer n : nums){
			
			if(FirstMax<n){
				SecondMax = FirstMax;
				FirstMax = n;
			} else if(SecondMax < n){
				SecondMax = n;
			}
			
			}
			System.out.println(FirstMax);
			System.out.println(SecondMax);
			
		}	
	    public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			int nums[] = new int[8];
			
			for(int i=0;i<8;i++){
			    
				 nums[i] = scan.nextInt();
				
				}
			TwoMaxNum t1 = new TwoMaxNum();
			
			t1.printTwoNumbers(nums);
			}
		}

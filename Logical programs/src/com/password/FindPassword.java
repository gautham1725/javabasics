package com.password;

import java.util.Arrays;
import java.util.Scanner;

public class FindPassword {
	
	
	public void findPassword(int input1, int input2, int input3, int input4, int input5) {
		
		
		int input[] = {input1,input2,input3,input4,input5};
		int b[] = new int[10];
		int a[] = new int[10];
		int Stable[] = new int[20];
		int Unstable[] = new int[30];
		int j=0;
		for(int i=0;i<input.length;i++) 
		{
			int num = input[i];
			for(j=0;j<a.length;j++)
			{
				a[j] = num%10;
				num = num/10;
			
			}
			int c[]=new int[j];
			for(int l=0;l<c.length;l++) {
				c[l]=a[l];
				System.out.println(c[l]);
			}
			int freq[] = new int[10];
			int k=0;
			int count=0;
			
			for(int x=0;x<10;x++)
			{
			  for(int y=0;y<c.length;y++)
			  {
				  if(c[y] == x) {
					  count++;
				  }
				  
			  }
			  freq[k]= count;
			  count=0;
			  k++;
			  
			}
			
			for(i=0;i<freq.length;i++)
			{
				for(int m=0;m<freq.length;m++) {
					if(freq[i] <freq[m]) {
						
						int temp = freq[i];
						freq[i]=  freq[m];
						freq[m] = temp ;
					}
					
				}
			}
			
			
			int s=0;
			int t=0;
			if(freq[1]==0) 
			{
				Stable[s]=num;
				s++;
				}
			else if(freq[2]==0) 
			{
				if(freq[0]==freq[1]) {
					Stable[s]= num;
					s++;
				}
				else {
					Unstable[t]=num;
					t++;
				}
			}
				else if(freq[3]==0) 
				{
					if(freq[0]==freq[2]) 
					{
						Stable[s]=num;
						s++;
					}
					else
					{
						Unstable[t]=num;
				     	t++;
					}
				}
				else if(freq[4]==0) {
					if(freq[0]==freq[3])
					{
						Stable[s]=num;
						s++;
					}
					else
					{
						Unstable[t]=num;
						t++;
					}
			}
		}
			int sum=0;
			for(int i=0;i<Unstable.length;i++)
			{
				sum = sum + Unstable[i];
			}
		
		System.out.println(sum);
			  
			}
		

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("Enter number 1 : ");
		int input1 = scan.nextInt();
		
		System.out.println("Enter number 2 : ");
		int input2 = scan.nextInt();
		
		System.out.println("Enter number 3 : ");
		int input3 = scan.nextInt();
		
		System.out.println("Enter number 4 : ");
		int input4 = scan.nextInt();
		
		System.out.println("Enter number 5 : ");
		int input5 = scan.nextInt();    */
		
		int input1=1001111111,input2=200,input3=1212,input4=4444,input5=300;
		FindPassword fp1 = new FindPassword();
		fp1.findPassword(input1, input2, input3, input4, input5);
       		
		
	}
	
	
}
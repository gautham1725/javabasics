package com.password;

import java.util.*;

public class ArrayPosition{
    public static void main(String[] args){
     /*   Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        String s = sc.nextLine();
        
        */
    	int a =4;
    	String s = "1 1 2 2";
        
        String s1[] = s.split(" ");
        
     /*   for(int i=0;i<a;i++) {
        	System.out.println(s1[i]);
        }    */
        
     //   int a = input2.length;
        int input[] = new int[a];
        
        for(int i=0; i<a ; i++){
            
        input[i] = Integer.parseInt(s1[i]);
        
        }
        
        Arrays.sort(input); 
        
        int temp =0;
        int flag=0;
        
        for(int i=0;i<a;i++){
            if(i%2==0){
                
                if(input[i]>input[i+1]){
                    
                    temp = input[i+1];
                    input[i+1] = input[i];
                    input[i] = temp;
                    
                    flag = input[2];
                    input[2]=input[1];
                    input[1]=flag;
                    
                    
                }
            }
        }
        
        String output = Arrays.toString(input);
        
        System.out.println(output);
            
            
        }
        
        
}

package com.password;

import java.util.Scanner;

public class EncodeArray {
   
    public static void findOriginal(int[] input2) {
        int output1 = input2[0];
        int output2 = 0;
       
        for(int i=0;i<input2.length;i++) {
            output2+=input2[i];
        }
       
        System.out.println(output1);
        System.out.println(output2);
    }
   
    public static void main(String[] args) {
       
        Scanner s1 = new Scanner(System.in);
        String input = s1.nextLine();
       
        String input1[] = input.split(" ");
        int input2[] = new int[input1.length];
       
        for(int i=0;i<input1.length;i++) {
            input2[i] = Integer.parseInt(input1[i]);		// String format to integer 
       
        }
        for (int i = 0; i < input2.length; i++) {
            if(input2[i] <0) {
                input2[i] = -input2[i];
            }
        }
        findOriginal(input2);
       
    }
}


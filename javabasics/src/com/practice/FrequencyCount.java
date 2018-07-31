package com.practice;
import java.util.Arrays;

public class FrequencyCount {
    public static void main(String args[]){ 
   
        char arr[] = {'a','b','d','a','c','b','a'};
        int freq[] = new int[10];
        char alp[] = {'a','b','c','d'};
        int count=0 ,k=0;             
        for(int i=0;i<alp.length;i++) {
        count=0;
            for (int j = 0; j < arr.length; j++) {
                if(alp[i] == arr[j]) {               
                    count++;
                }                  // to identify the freq of elements
            }
            freq[k] = count;        // mainly used for integers // eg.. stsble numbers
            k++;
        }
       
       // Arrays.sort(freq);
       
        for (int j = 0; j < freq.length; j++) {
            System.out.println(freq[j]);
        }
           
        }
    }

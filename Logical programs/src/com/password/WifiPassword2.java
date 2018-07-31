package com.password;

import java.util.*;

public class WifiPassword2{
    public static void main(String[] args){
        
        Scanner s1 = new Scanner(System.in);
        
        int i1 = s1.nextInt();
        System.out.println(i1);
        String i2 = s1.next();
        System.out.println(i2);
        String output;
        String c ="";
        char d = 0 ;
        
        int len = i2.length();
        System.out.println(len);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = i1%10;
            i1/=10;
        }
        
        int max=0,min=0;
        
        Arrays.sort(a);
        
       

        max=a[a.length-1];
        min=a[0];
        
                
        if(len%2!=0){
            c = "$";
        }else
        c= "#";
        
        d = i2.charAt(len/2);
      
        output = (""+max+c+min+d) ;
        
        if(len==5){
            System.out.println("0000");
        }
        else
        {
            System.out.println(output);
        }
    } 
        
}



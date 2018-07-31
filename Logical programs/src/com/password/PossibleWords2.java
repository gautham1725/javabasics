package com.password;

public class PossibleWords2 {
	
    public static void identifyPossibleWords(String input1, String input2){
        
        String[] c = input1.split("_");
        String[] d = input2.split(":");
        
        int len = input1.length();
        
        String[] output = new String[10];
        int x = 0;
        for(int i=0;i<d.length;i++){
        	
        	if(c.length == 2){
        		
        		if( d[i].startsWith(c[0]) && d[i].endsWith(c[c.length-1])  
            		&& d[i].length() == len )
        				{
        					output[x] = d[i];
        					x++;
        				}
        		}else if(c.length !=2){
        			if(((d[i].startsWith(c[0]) || d[i].endsWith(c[0])) && d[i].length() == len))
        			{
        				output[x] = d[i];
        				x++;
        			}
        		}
        }
        
        if(x==0)
        {
        	System.out.print("ERROR");
        }
        
        for (int i=0; i<x; i++) {
			
        	if(i<x-1)
        	{
            	System.out.print(output[i]+":");
            }     
            else if(i==x-1)
            {
            	System.out.print(output[i]);
            } 
		}
        
    }
    public static void main(String[] args){
        
        String a = args[0].toUpperCase();
        String b = args[1].toUpperCase();
        
        identifyPossibleWords(a,b);
        
    }
}


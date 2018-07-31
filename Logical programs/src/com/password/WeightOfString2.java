package com.password;

public class WeightOfString2 {
		   
        public int weightOfString(String input1,int input2){
           
            input1 = input1.toUpperCase();
            char[] b = input1.toCharArray();
           
            int d[] = new int[b.length];
            int x = 0, sum = 0;
           
            for(int i=0;i<b.length;i++){
                int c =(int)b[i];
                d[x]=c-64;
                x++;
            }
           
    if(input2==1){
            for(int j=0;j<d.length;j++){
                if(d[j]>0 && d[j]<=26){
                sum=sum+d[j];
            }
            }
    }
    else{
        for(int j=0;j<d.length;j++){
                if((d[j]>0 && d[j]<=26)&&(d[j]!=1&&d[j]!=5&&d[j]!=9&&d[j]!=15&&d[j]!=21)){
                sum=sum+d[j];
            }
          }
      }
        return sum;
        }
   
    public static void main(String[] args) {
       
    	WeightOfString2 w1 =  new WeightOfString2();
       
        System.out.println(w1.weightOfString("hello world", 0));

    }

}


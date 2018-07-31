package com.password;


import java.util.Arrays;

public class WiFiPin2 {		//  alpha , beta , gaama	

	public int wifiPin(int input1 ,int input2 ,int input3){
		

		int input[] = { input1 , input2 , input3 };
		
		int ones[] = new int[3];
		int tens[] = new int[3];
		int hundreds[] = new int[3];
		
		for(int i=0;i<input.length;i++){
			
		   	ones[i] = input[i]%10;
			tens[i] = (input[i]/10)%10;
			hundreds[i] = input[i]/100;
		}
		
		Arrays.sort(ones);
		Arrays.sort(tens);
		Arrays.sort(hundreds);
		
		int x = 2,max;
		if(ones[x]>tens[x] && ones[x]>hundreds[x]){
			max = ones[x];
		}else if(tens[x]>ones[x] && tens[x]>hundreds[x]){
			max = tens[x];
		}else{
			max = hundreds[x];
		}
		int result = (max*1000)+(hundreds[0]*100)+(tens[0]*10)+(ones[0]);
		
		return result ;
		
	}
	
		
	public static void main(String[] args){
		WiFiPin2 w1 = new WiFiPin2();
		
		System.err.println(w1.wifiPin(190, 267, 853));
	}

}

package com.password;

public class AdditionOfNumbers {
	
		public static void main(String[] args) {
			
			int input1 =845;
			int input2 =457;
			int input3 =124;
			int input4 = 2;
			
	        int input[] = { input1 , input2 , input3 };
			
			int ones[] = new int[3];
			int tens[] = new int[3];
			int hundreds[] = new int[3];
			
			
			
	   /*	if((input1<9) || (input2<9) || (input3  < 9)){
				
				for (int i = 0; i < tens.length; i++) {
					tens[i] = 1;
				}
				
			}	*/
			
			for (int i = 0; i < tens.length; i++) {
				if(input[i]<9){
					
					input[i] += 210;
				}else if(input[i]<99){
					
					input[i] += 200;
				}
			}
			
			for(int i=0;i<input.length;i++){
				
			   	ones[i] = input[i]%10;
				tens[i] = (input[i]/10)%10;
				hundreds[i] = input[i]/100;
			}
			
	/*		if((input1<99) || (input2<99) || (input3  < 99)){
				
				for (int i = 0; i < hundreds.length; i++) {
					hundreds[i] = 2;
				}
				
			}		*/
			
			int result=0;
			
			if(input4 == 0){
				 result =  ones[0] + ones[1] + ones[2] ;
			}else if(input4 ==1){
				 result =  tens[0] + tens[1] + tens[2] ;
			}else if(input4 == 2){
				 result =  hundreds[0] + hundreds[1] + hundreds[2] ;
			}
			
			System.out.println(result);
		}

	}



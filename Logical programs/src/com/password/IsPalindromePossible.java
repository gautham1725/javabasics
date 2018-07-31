package com.password;

public class IsPalindromePossible {

	public static void main(String[] args) {
		
		int input1=0;
		
		String numStr = String.valueOf(input1);
		int length = numStr.length();
		boolean isEven = false;
		
		if(length %2 == 0) {
			isEven = true;
		}else {
			isEven = false;
		}
		
		int arr[] = new int[10];
		
		int numCpy = input1;
		int r=0;
		while(numCpy!=0) {
			r = numCpy%10;
			arr[r]+=1;
			numCpy/=10;
		}
		
		int flag = 0;
		
		if(isEven) {
			for(int i=0;i<10;i++) {
				if(arr[i]%2==1) {
					flag = 1;
					break;
				}
			}
	/*		if(flag == 1) {
				return false;
			}else {
				return true;
			}
		}else if{
			int oddCount = 0;
			for(int i=0;i<10;i++) {
				if(arr[i]%2 ==1) {
					oddCount++;
				}
			}
		}
		if(oddCount == 1) {
			return true;
		}else {
			return false;
		}

*/	}

}
}
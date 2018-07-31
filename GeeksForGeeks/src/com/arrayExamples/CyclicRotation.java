package com.arrayExamples;

public class CyclicRotation {

	void rotate1(int arr[] , int d) {
		for(int i=0; i<2; i++) {
			rotate( arr , 2);
		}
	}
	
	void rotate(int arr[] , int d) {
		int temp = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	public static void main(String[] args) {
		
		CyclicRotation cr = new CyclicRotation();
		int arr[] = {1,2,3,4,5};
		int d=2;
		cr.rotate1(arr , 2);
	

	for(int i=0;i<arr.length; i++) {
		System.out.print(arr[i]);
	}
}

}
package com.test;

public class PascleTriangle {

	public static void main(String[] args) {
		
		int n = 5;
		int a[][] = new int[n][(n*2)-1];
		a[0][n-1]=1;
		for(int i=0; i<n; i++) {
			for(int j=0;j<(n*2)-2;j++) {
				if(i==n-1) {
					a[i][0]=1;
					a[i][n*2-2]=1;
				}
				if(i!=0&&j!=0&&j!=(n*2)-2) {
					if(j==n-1+i || j==n-1-i) {
						a[i][j]=1;
					}
					if(a[i-1][j-1]>0 && a[i-1][j+1]>0) {
						a[i][j]=a[i-1][j-1]+a[i-1][j+1];
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0;j<(n*2)-1;j++) {
				if(a[i][j]>0) {
					System.out.print(a[i][j]);
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}

	}

}

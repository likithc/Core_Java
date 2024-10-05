package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of matrix");
		int n = sc.nextInt();
		
		int m1[][] = new int[n][n];
		int m2[][] = new int[n][n];
		int res[][] = new int[n][n];
		
		System.out.println("collecting first matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m1[i][j] = sc.nextInt();
			}
		}
			
	}

}

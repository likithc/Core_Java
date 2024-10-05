package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

public class Printnums5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of terms :");
		int n=sc.nextInt();
		
		int a=0,b=1;
		
		System.out.println("fibonacco series :");
		
		for(int i=0;i<n;i++) {
			if(i<=1) {
				System.out.print(i + " ");
			} else {
				int next=a+b;
				System.out.print(next + " ");
				a=b;
				b=next;
			}
		}
	}

}

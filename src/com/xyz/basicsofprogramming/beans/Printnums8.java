package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

public class Printnums8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		long fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial nums is :" +fact);
	}
}
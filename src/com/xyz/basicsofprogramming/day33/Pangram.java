package com.xyz.basicsofprogramming.day33;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				int temp = str.charAt(i)-65;
				arr[temp] = 1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println("not a pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");
	}
}
package com.xyz.basicsofprogramming.day18;

import java.util.Scanner;

public class ArrayCode1 {
	static String arr[];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enetr the size :");
		int size = sc.nextInt();
		
		createArray(size);
		insertArray(size);
		displayArray(size);
	}

	private static void createArray(int size) {
		arr =  new String[size];
	}

	private static void insertArray(int size) {
		System.out.println("collecting array data");
		for(int i=0;i<size;i++) {
			arr[i] = sc.next();
		}
	}

	private static void displayArray(int size) {
		System.out.println("displaying array daya");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

}

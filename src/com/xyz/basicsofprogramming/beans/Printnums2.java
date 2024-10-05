package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

class linearSearch{
	private int arr[];
	private int size;
	Scanner sc = new Scanner(System.in);
	
	void CreateArray(){
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		arr = new int[size];
	}
	
	void addElements() {
		System.out.println("Enter the array elements:");
		for(int i=0;i< size;i++) {
			arr[i] = sc.nextInt();
		}
	}
	void Search() {
		System.out.println("Enter key element to search :");
		int key = sc.nextInt();
		int flag=0;
		for(int i=0; i<size; i++) {
			if(arr[i] == key) {
				System.out.println("found at" + (i+1));
				flag++;
				break;
			}
		}
		
		if(flag ==0) {
			System.out.println("not found");
		}
	}
}

public class Printnums2 {
	public static void main(String[] args) {
		linearSearch ls =new linearSearch();
		ls.CreateArray();
		ls.addElements();
		ls.Search();
		
		
	}
}

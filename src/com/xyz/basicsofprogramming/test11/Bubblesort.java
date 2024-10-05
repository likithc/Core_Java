package com.xyz.basicsofprogramming.test11;

import java.util.Scanner;

class bubblesortops{
	private int arr[];
	private int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("enter the size of an array");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter the array");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	void sort() {
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	void display() {
		for(int i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	}
	}
}

public class Bubblesort {
	public static void main(String[] args) {
		bubblesortops b = new bubblesortops();
		b.createArray();
		b.sort();
		b.display();
	}
}

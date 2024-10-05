package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

class bubble{
	private int arr[];
	private int size;
	Scanner sc = new Scanner(System.in);
	
	void Array() {
		System.out.println("Enter size of array");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter array");
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
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.println("sorted elements are : " + arr[i]+" ");
		}
	}
}

public class Printnums4 {
	public static void main(String[] args) {
		bubble b = new bubble();
		b.Array();
		b.sort();
		b.display();
	}
}

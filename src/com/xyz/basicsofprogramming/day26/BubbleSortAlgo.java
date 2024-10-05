package com.xyz.basicsofprogramming.day26;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort{
	private int arr[];
	Scanner sc = new Scanner(System.in);
	private int size;
	
	void createArray() {
		System.out.println("Array Creation");
		System.out.println("Enter the array size");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is ready");
		System.out.println("==================");
	}
	
	void addElements() {
		System.out.println("collecting the array elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements added");
		System.out.println("===================");
	}
	void sort() {
		System.out.println("elements are sorting");
		int temp = 0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("elements are sorted");
		System.out.println("================================");
	}
	void display() {
		System.out.println("Sorted elemments are :" );
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}

public class BubbleSortAlgo {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.createArray();
		bs.addElements();
		bs.sort();
		bs.display();
	}

}

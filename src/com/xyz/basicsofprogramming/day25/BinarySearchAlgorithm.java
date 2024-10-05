package com.xyz.basicsofprogramming.day25;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
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
		Arrays.sort(arr);
		System.out.println("Array is sorted");
		System.out.println("===================");
	}
	
	void Search() {
		System.out.println("seaching started");
		System.out.println("enter the elements to be found");
		int key = sc.nextInt();
		int flag=0;
		int first = 0;
		int last = size - 1;
		while(first <= last) {
			int mid = (first+last)/2;
			if(arr[mid] == key) {
				System.out.println("emlements is found in position:" +(mid+1));
				flag++;
				break;
			}
			else if(arr[mid] < key) {
				first = mid+1;
			}
			else if(arr[mid] > key) {
				last = mid-1;
			}
		}
		
	
	if(flag==0) {
		System.out.println("elements not found");
		System.out.println("===================");
	}
}

	public static void main(String[] args) {
		BinarySearchAlgorithm bs = new BinarySearchAlgorithm();
		bs.createArray();
		bs.addElements();
		bs.Search();
		
	}

}

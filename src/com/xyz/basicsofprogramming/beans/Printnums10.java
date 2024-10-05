package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

class binarysearch{
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
	void search() {
		System.out.println("key element");
		int key = sc.nextInt();
		int flag =0;
		int first =0;
		int last = size-1;
		while(first <= last) {
			int mid = (first+last)/2;
			if(arr[mid] == key) {
				System.out.println("Element found at :" +(mid+1));
				flag++;
				break;
			}
			else if(arr[mid] < key){
					first = mid+1;
				}
			else if(arr[mid] > key) {
				last = mid-1;
			}
			}

		if(flag==0) {
			System.out.println("not found");
		}
	}
}

public class Printnums10 {
	public static void main(String[] args) {
		binarysearch bs = new binarysearch();
		bs.Array();
		bs.search();
	}
}

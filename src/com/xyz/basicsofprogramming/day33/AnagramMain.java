package com.xyz.basicsofprogramming.day33;

import java.util.Scanner;

class Anagram{
	int flag =0;
	char arr1[];
	char arr2[];
	int logic(String s1,String s2) {
		//convert the string into an array
		convertToArray(s1,s2);
		if(flag ==-1) {
			return flag;
		}
		else {
			sorting();
			comparision();
		}
		return flag;
	}
	private void comparision() {
		// TODO Auto-generated method stub
		System.out.println("Comparing the array");
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				flag = -1;
				break;
			}
		}
		System.out.println("comparing array is completed");
		System.out.println("=================");
	}
	private void sorting() {
		char temp1;
		//sorting first array
		System.out.println("Sorting the array.....");
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					temp1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp1;
				}
			}
		}
		char temp2;
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					temp2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp2;
				}
			}
		}
		System.out.println("Sorting is completed");
		System.out.println("==========================");
	}
	private void convertToArray(String s1, String s2) {
		System.out.println("converting the string to array");
		arr1 = new char[s1.length()];
		arr2 = new char[s2.length()];
		if(s1.length()==s2.length()) {
			for(int i=0;i<arr1.length;i++) {
				arr1[i] = s1.charAt(i);
				arr2[i] =s2.charAt(i);
			}
			}else {
				flag =-1;
				return;
			}
		System.out.println("conversion is done");
		System.out.println("==========================");
		}
		
}

public class AnagramMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string 1 :");
			String s1 = sc.next();
			
			System.out.println("Enter the string 2 ;");
			String s2 = sc.next();
			 Anagram a = new Anagram();
			 int res = a.logic(s1, s2);
			 if(res==0) {
				 System.out.println("The string is anagram");
			 }else {
				 System.out.println("The string is not anagram");
			 }
	
	}
}

package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

public class Printnums3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rnter the string");
		String str1 = sc.next();
		String str2 ="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrom");
		}
		
		int flag=0;
		//to check strings are equal size or not
		if(str1.length()==str2.length()) {
			//comparing the contents
			for(int i=0;i<str1.length();i++) {
				//logic to compare the contents
				if(str1.charAt(i)!=str2.charAt(i)) {
					flag=1;
				}
			}
		}
		//to finalize the string is palindrome or not
		if(flag==0) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
	}
}

package com.xyz.basicsofprogramming.day32;

import java.util.Scanner;

class Segregartion{
	static String alphabet_str="";
	static String numric_str="";
	static String special_str="";
	
	
	void segregate(String s) {
		System.out.println("Segregating");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
				alphabet_str = alphabet_str + s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57 ) {
				numric_str = numric_str + s.charAt(i);
			}
			else {
				special_str = special_str + s.charAt(i);
			}
		}
	}
	void display() {
		System.out.println("The alphabetic String is : " +alphabet_str);
		System.out.println("The numeric String is : " +numric_str);
		System.out.println("The special String is : " +special_str);
	}
	
}

public class WordSegregation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string");
			String str1 = sc.nextLine();
			Segregartion sg = new Segregartion();
			sg.segregate(str1);
			sg.display();
		}
		
		
	}

}

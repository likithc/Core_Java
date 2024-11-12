package com.xyz.basicsofprogramming.day49;

import java.util.Scanner;

	class operation1{
	void operation1() {
	try{
	System.out.println("Inside Operation1");
	Scanner sc =new Scanner(System.in);
	System.out.println("num1");
	int num1 = sc.nextInt();
	System.out.println("num2");
	int num2 = sc.nextInt();
	int res = num1/num2;
	System.out.println(res);
	System.out.println("=====================");
	}
	catch(Exception e) {
		System.out.println("Exception handeled in Operation-1");
		throw e;
	}
	finally {
		System.out.println("Left operation-1");
	}
   }
}
public class ExceptionCode10{
	public static void main(String[] args) {
		System.out.println("Inside main");
		operation1 op1 = new operation1();
		try {
			op1.operation1();
		} catch (Exception e) {
			System.out.println("Handeled in main");
		}
		System.out.println("Left main");
	}
}
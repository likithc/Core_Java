package com.xyz.basicsofprogramming.day48;

import java.util.Scanner;


	class operation1{
	void operation1() throws Exception
	{
	System.out.println("Inside Operation1");
	Scanner sc =new Scanner(System.in);
	System.out.println("num1");
	int num1 = sc.nextInt();
	System.out.println("num2");
	int num2 = sc.nextInt();
	int res = num1/num2;
	System.out.println(res);
	System.out.println("=====================");
	
	System.out.println("Array Operation");
	System.out.println("Enter size of an array :");
	int size =sc.nextInt();
	int arr[] = new int[size];
	System.out.println("enter the position to insert an element");
	int pos = sc.nextInt();
	System.out.println("enter the value");
	int value = sc.nextInt();
	System.out.println("Value inserted");
	System.out.println("Left operation1");	
	}
}
	class operation2{
		void operation2() throws Exception{
			System.out.println("Inside operation2");
			operation1 op1 = new operation1();
			op1.operation1();
			System.out.println("Left operation2");
		}
	}
	class operation3{
		void operation3() throws Exception{
			System.out.println("Inside operation3");
			operation2 op2 = new operation2();
			op2.operation2();
			System.out.println("Left operation3");
		}
	}
	public class ExceptionCode9 {
		public static void main(String[] args) {
			System.out.println("Inside main");
			operation3 op3 = new operation3();
			try {
				op3.operation3();
			} catch (Exception e) {
				System.out.println("Handeled in main");
			}
			System.out.println("Left main");
			
		}
}

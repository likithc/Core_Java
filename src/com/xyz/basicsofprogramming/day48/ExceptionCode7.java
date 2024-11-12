package com.xyz.basicsofprogramming.day48;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCode7 {
public static void main(String[] args) {
		
		try{
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
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception handeled");
		}
		catch(NegativeArraySizeException |ArrayIndexOutOfBoundsException e) {
			System.out.println("Negative Array Size Exception handeled");
		}
		finally {
			System.out.println("Hi from finally");
		}
}
}

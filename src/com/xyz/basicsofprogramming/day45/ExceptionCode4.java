package com.xyz.basicsofprogramming.day45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCode4 {
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
		catch(NegativeArraySizeException n) {
			System.out.println("Negative Array Size Exception handeled");
		}
		catch(IndexOutOfBoundsException i) {
			System.out.println("Index   Out Of Bounds Exception handeled");
		}
		catch(InputMismatchException im) {
			System.out.println("Input Mismatch Exception handeled");
		}
		catch(Exception e) {
			System.out.println("Exception handeled");
		}
	}
}

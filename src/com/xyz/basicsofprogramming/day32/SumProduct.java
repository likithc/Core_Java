package com.xyz.basicsofprogramming.day32;

import java.util.Scanner;

class sumandproduct{
	long sum(String s) {
		long sum =0;
		System.out.println("sum");
		for(int i=0;i<s.length();i++) {
			sum = sum + s.charAt(i);
			}
		return sum;
	}
	long product(String s) {
		long product =1;
		System.out.println("product");
		for(int i=0;i<s.length();i++) {
			product = product * s.charAt(i);
			}
		return product;
	} 
}
public class SumProduct {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string");
			String str1 = sc.nextLine();
			sumandproduct sp = new sumandproduct();
			long sum = sp.sum(str1);
			System.out.println("the sum of string is :" +sum);
			long product = sp.product(str1);
			System.out.println("the product of string is :" +product);
		}
	}

}

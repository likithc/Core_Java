package com.xyz.basicsofprogramming.day44;

import java.util.Scanner;

public class ExceptionCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1 :");
		int num1 = sc.nextInt();
		System.out.println("Num2 :");
		int num2 = sc.nextInt();
		int res = num1 / num2;
		System.out.println(res);
	}
}

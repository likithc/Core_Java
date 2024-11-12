package com.xyz.basicsofprogramming.day50;

import java.util.Scanner;

public class ThreadCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println(res);
		System.out.println("Completed");
		
		
		
		System.out.println("Printing operation");
		for(int i=0 ;i<=5;i++) {
			try {
			System.out.println("Hello world");
			Thread.sleep(3000);
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Multiplication ");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int result = num3 / num4;
		System.out.println(result);
		System.out.println("Completed");
	}
}

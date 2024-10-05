package com.xyz.basicsofprogramming.day12;

import java.util.Scanner;

public class Launch2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter byte data");
		byte byt=sc.nextByte();
		System.out.println("Byte data is:"+byt);
		System.out.println("Enter int data");
		int i=sc.nextInt();
		System.out.println("int data is:"+i);
		System.out.println("Enter float data");
		float f=sc.nextFloat();
		System.out.println("float data is:"+f);
		System.out.println("Enter double data");
		double d=sc.nextDouble();
		System.out.println("double data is:"+d);
		System.out.println("Enter short data");
		Short s=sc.nextShort();
		System.out.println("short data is:"+s);
		System.out.println("Enter string data");
		String sr=sc.next();
		System.out.println("string data is:"+sr);

	}

}

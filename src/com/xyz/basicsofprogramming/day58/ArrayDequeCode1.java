package com.xyz.basicsofprogramming.day58;

import java.util.ArrayDeque;

public class ArrayDequeCode1 {
	public static void main(String[] args) {
		//add(Object o) method
		ArrayDeque al = new ArrayDeque();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		
		System.out.println(al);
		
		ArrayDeque al1 = new ArrayDeque();
		al1.add(420);
		al1.add(25);
		al1.add(50);
		al1.add(75);
		al1.add(125);
		System.out.println(al1);
		
		//add(collection c) method
		al.add(al1);
		System.out.println(al);
		
		
	}

}


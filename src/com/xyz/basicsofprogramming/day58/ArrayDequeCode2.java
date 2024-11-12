package com.xyz.basicsofprogramming.day58;

import java.util.ArrayDeque;

public class ArrayDequeCode2 {
	public static void main(String[] args) {
		ArrayDeque al1 = new ArrayDeque();
		al1.add(420);
		al1.add(25);
		al1.add(150);
		al1.add(75);
		al1.add(125);
		System.out.println(al1);
		
		//clone()
		ArrayDeque al = (ArrayDeque) al1.clone();
		System.out.println(al);
		
		//clear()
		al1.clear();
		System.out.println(al1);
		//contains()
		boolean res =al.contains(150);
		System.out.println(res);
		 res =al.contains(1500);
		System.out.println(res);
		
		ArrayDeque al2 = new ArrayDeque();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		//containsAll(Collection c)
		
	}
}

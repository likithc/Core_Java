package com.xyz.basicsofprogramming.day57;

import java.util.ArrayList;

public class ArrayListCode2 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(420);
		al1.add(25);
		al1.add(150);
		al1.add(75);
		al1.add(125);
		System.out.println(al1);
		
		//clone()
		ArrayList al = (ArrayList) al1.clone();
		System.out.println(al);
		
		//clear()
		al1.clear();
		System.out.println(al1);
		//contains()
		boolean res =al.contains(150);
		System.out.println(res);
		 res =al.contains(1500);
		System.out.println(res);
		
		ArrayList al2 = new ArrayList();
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

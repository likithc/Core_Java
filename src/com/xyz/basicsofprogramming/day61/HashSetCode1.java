package com.xyz.basicsofprogramming.day61;

import java.util.HashSet;

public class HashSetCode1 {
	public static void main(String[] args) {
		//add(Object o) method
		HashSet al = new HashSet();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		//add(int i,Object o) method
		al.add(2, 4000);
		System.out.println(al);
		
		HashSet al1 = new HashSet();
		al1.add(420);
		al1.add(25);
		al1.add(50);
		al1.add(75);
		al1.add(125);
		System.out.println(al1);
		
		//add(collection c) method
		al.add(al1);
		System.out.println(al);
		
		//add(int i,collection c) method
		al.add(1,al1);
		System.out.println(al);
	}

}


package com.xyz.basicsofprogramming.day61;

import java.util.HashSet;

public class HashSetCode8 {

	public static void main(String[] args) {
		HashSet ts = new HashSet();
		ts.add(100);
		ts.add(25);
		ts.add(150);
		ts.add(150);
		ts.add(50);
		ts.add(75);
		ts.add(125);
		System.out.println(ts);
		
		System.out.println(ts.ceiling(40));
		System.out.println(ts.ceiling(50));
		System.out.println(ts.higher(40));
		System.out.println("=================");
		System.out.println(ts.floor(40));
		System.out.println(ts.floor(500));
		System.out.println(ts.lower(40));
		System.out.println("=================");
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println("=================");
		System.out.println(ts.headSet(50));
		System.out.println(ts.tailSet(50));
	


	}

}

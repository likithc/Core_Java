package com.xyz.basicsofprogramming.day61;

import java.util.HashSet;

public class HashSetCode6 {
//homogeneous HashSet using Generics
	public static void main(String[] args) {
		HashSet<Integer> al = new HashSet<Integer>();
		al.add(100); // accepted
		al.add(200);
		al.add(20.5f); // not accepted
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		
		
	}

}

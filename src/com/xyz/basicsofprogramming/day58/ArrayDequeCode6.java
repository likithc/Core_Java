package com.xyz.basicsofprogramming.day58;

import java.util.ArrayDeque;

public class ArrayDequeCode6 {
//homogeneous ArrayDeque using Generics
	public static void main(String[] args) {
		ArrayDeque<Integer> al = new ArrayDeque<Integer>();
		al.add(100); // accepted
		al.add(200);
		al.add(20.5f); // not accepted
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		
		
	}

}

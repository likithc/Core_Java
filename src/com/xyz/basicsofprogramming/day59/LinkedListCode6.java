package com.xyz.basicsofprogramming.day59;

import java.util.LinkedList;

public class LinkedListCode6 {
//homogeneous LinkedList using Generics
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(100); // accepted
		al.add(200);
		al.add(20.5f); // not accepted
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		
		
	}

}

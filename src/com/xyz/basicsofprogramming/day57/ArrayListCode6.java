package com.xyz.basicsofprogramming.day57;

import java.util.ArrayList;

public class ArrayListCode6 {
//homogeneous ArrayList using Generics
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100); // accepted
		al.add(200);
		al.add(20.5f); // not accepted
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		
		
	}

}

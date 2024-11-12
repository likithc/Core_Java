package com.xyz.basicsofprogramming.day61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Launch {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(25);
		al.add(150);
		al.add(175);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(100);
		al.add(125); 
		System.out.println(al);
//		TreeSet ts = new TreeSet();
//		ts.addAll(al);
//		al.clear();
//		al.addAll(ts);
//		System.out.println(al);
//		
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.binarySearch(al,150);
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		
	    Collections.min(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
	    System.out.println(	Collections.frequency(al, 50));
		
	    Collections.swap(al, 0, 5);
		System.out.println(al);
		
		Collections.indexOfSubList(al, al);
		System.out.println(al);


	}
}

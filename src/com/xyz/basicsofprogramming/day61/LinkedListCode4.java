package com.xyz.basicsofprogramming.day61;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCode4 {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(200);
		
		
		LinkedList al1 = new LinkedList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(7);
		
		al.addAll(al1);
		//size()
		int size = al.size();
		System.out.println(size);
		
		//retainAll(collection c)
		al.retainAll(al1);
		System.out.println(al);
	

		System.out.println(al);
		//toArray()
		Object[] array = al.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		//toString()
		String string=al.toString();
		System.out.println(string);
		System.out.println(string.charAt(1));
		System.out.println(string.charAt(2));
		
	}

}

package com.xyz.basicsofprogramming.day57;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCode4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(200);
		
		
		ArrayList al1 = new ArrayList();
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
		//set(size,collection)
		al.set(2,200);
		System.out.println(al);
		//sublist(int start,int end)
		List l =al.subList(3,5);
		System.out.println(l);
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

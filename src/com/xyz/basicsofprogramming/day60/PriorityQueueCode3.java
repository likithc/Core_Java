package com.xyz.basicsofprogramming.day60;

import java.util.PriorityQueue;
import java.util.PriorityQueue;

public class PriorityQueueCode3 {
	public static void main(String[] args) {
		PriorityQueue al = new PriorityQueue();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(200);
		System.out.println(al);
		
		
//		Object object1=al.get(350);
//		System.out.println(object1);
//		
		//getClass
		System.out.println(al.getClass());
		
		//hashcode()
		int hashCode = al.hashCode();
		System.out.println(hashCode);
		
		
		//isEmpty()
		boolean Empty = al.isEmpty();
		System.out.println(Empty);
		
		//lastIndexOf(Object o)
		
		//remove(Object o)
		Object remove = al.remove(1);
		System.out.println(remove);
		System.out.println(al);
		
		PriorityQueue al1 = new PriorityQueue();
		al1.add(100);
		al1.add(150);
		al1.add(200);
		System.out.println(al1);
	
		al.addAll(al1);
		System.out.println(al);
		//removeAll(collection c)
		al.removeAll(al1);
		System.out.println(al);
		
		
		
	}
}

package com.xyz.basicsofprogramming.day61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Launch2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(25);
		al.add(150);
		al.add(175);
		al.add(75);
		al.add(100);
		al.add(125); 


		System.out.println("===================");
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("===================");
		System.out.println("Using for each loop");
		for (Object data : al) {
			System.out.println(data);
		}
		System.out.println("===================");
		System.out.println("Using iterators");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}

		System.out.println("===================");
		System.out.println("Using List Iterators");
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext()==true) {
			System.out.println(litr.next());
		}
	}

}

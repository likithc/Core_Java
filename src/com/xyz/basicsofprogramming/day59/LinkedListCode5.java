package com.xyz.basicsofprogramming.day59;

import java.io.Serializable;
import java.util.LinkedList;

public class LinkedListCode5 {
//heterogeneous
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Serializable> al = new LinkedList();
		al.add(100);
		al.add(200);
		al.add(20.5f);
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		System.out.println(al);
	    al.pop();
	    System.out.println(al);
	    al.poll();
	    System.out.println(al);
	    al.push(al);
	    System.out.println(al);
	    
	}

}

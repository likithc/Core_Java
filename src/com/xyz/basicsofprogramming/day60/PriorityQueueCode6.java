package com.xyz.basicsofprogramming.day60;

import java.util.PriorityQueue;

public class PriorityQueueCode6 {
//homogeneous PriorityQueue using Generics
	public static void main(String[] args) {
		PriorityQueue al = new PriorityQueue();
		al.add(100); // accepted
		al.add(200);
		al.add(20.5f); // not accepted
		al.add(12345.76543);
		al.add('r');
		al.add("Likith");
		al.add(true);
		
		
	}

}

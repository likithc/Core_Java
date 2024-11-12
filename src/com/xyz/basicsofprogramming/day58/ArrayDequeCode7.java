package com.xyz.basicsofprogramming.day58;

import java.util.ArrayDeque;

public class ArrayDequeCode7 {

	public static void main(String[] args) {
	 ArrayDeque ad = new ArrayDeque();
	 ad.add(100);
	 ad.add(200);
	 ad.add(300);
	 ad.add(400);
	 ad.add(500);
	 ad.add(600);
	 System.out.println(ad);
	 
	 ad.push(999);
	 System.out.println(ad);
	 
	 ad.pop();
	 System.out.println(ad);
	 
	 ad.offer(999);
	 System.out.println(ad);
	 
	 ad.offerFirst(111);
	 System.out.println(ad);
	 ad.offerLast(888);
	 System.out.println(ad);
	 
	 System.out.println(ad.peek()); 
	 System.out.println(ad);
	 
	 System.out.println(ad.peekFirst()); 
	 
	 System.out.println(ad.peekLast()); 
	 
	 System.out.println(ad);
	 
	 ad.poll();
	 System.out.println(ad);
	 
	 ad.pollFirst();
	 System.out.println(ad);
	 
	 ad.pollLast();
	 System.out.println(ad);
	}

}

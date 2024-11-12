package com.xyz.basicsofprogramming.day59;

import java.util.LinkedList;

public class LinkedListCode7 {

	public static void main(String[] args) {
	 LinkedList ad = new LinkedList();
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
	 
	 ad.removeFirst();
	 System.out.println(ad);
	 
	 ad.removeLast();
	 System.out.println(ad);
	 
	 ad.removeFirstOccurrence(ad);
	 System.out.println(ad);
	 
	 ad.removeLastOccurrence(ad);
	 System.out.println(ad);
	 
	}

}

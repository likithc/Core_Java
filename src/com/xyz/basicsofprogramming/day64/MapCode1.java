package com.xyz.basicsofprogramming.day64;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapCode1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rahul");
		hm.put(2, "Sachin");
		hm.put(3, "Dhoni");
		hm.put(4, "Virat");
		hm.put(5, "Rohith");
		System.out.println(hm);
		
//		hm.clear();
		HashMap hm1 = (HashMap) hm.clone();
		System.out.println();
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsKey(30));
		System.out.println(hm.containsValue("Dhoni"));
		System.out.println(hm.containsValue("likith"));
		System.out.println(hm.get(1));
		System.out.println(hm.get(7));
		
		Set<Integer> keySet = hm.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		Collection<String> c = hm.values();
		Iterator iterator1 = c.iterator();
		while(iterator1.hasNext()==true) {
			System.out.println(iterator1.next());
		}
	}

}

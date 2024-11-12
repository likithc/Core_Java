package com.xyz.basicsofprogramming.day50;

public class ThreadCode1 {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		System.out.println("=========");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("=========");
		t.setName("likith");
		t.setPriority(3);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(30);
		System.out.println(t);
		
	}

}

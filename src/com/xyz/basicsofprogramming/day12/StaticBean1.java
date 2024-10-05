package com.xyz.basicsofprogramming.day12;

public class StaticBean1 {
	static int a,b,c;
	int p,q,r;
	
	static {
		System.out.println("Hi from static");
		a=100;
		b=200;
		c=300;
	}
	{
		p=1001;
		q=2001;
		r=3001;
//		a=1001;
//		b=2001;
//		c=3001;
	}
	public static void displayStatic() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public void displayNonStatic(){
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}

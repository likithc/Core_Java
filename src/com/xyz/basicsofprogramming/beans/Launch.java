package com.xyz.basicsofprogramming.beans;

import com.xyz.basicsofprogramming.day12.StaticBean1;

public class Launch {

	public static void main(String[] args) {
		System.out.println("hi from main");
		StaticBean1.displayStatic();
		System.out.println("--------------------");
		StaticBean1 sb1 = new StaticBean1();
		sb1.displayStatic();
		System.out.println("-----------------");
		sb1.displayNonStatic();
	}

}

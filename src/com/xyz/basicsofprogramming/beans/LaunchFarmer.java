package com.xyz.basicsofprogramming.beans;

import com.xyz.basicsofprogramming.day13.Farmer;

public class LaunchFarmer {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		Farmer f4 = new Farmer();
		
		System.out.println("farmer-1");
		f1.collectdata();
		f1.calculate();
		f1.display();
		System.out.println("-------------------");
		System.out.println("farmer-2");
		f2.collectdata();
		f2.calculate();
		f2.display();
		System.out.println("-------------------");
		System.out.println("farmer-3");
		f3.collectdata();
		f3.calculate();
		f3.display();
		System.out.println("-------------------");
		System.out.println("farmer-4");
		f4.collectdata();
		f4.calculate();
		f4.display();
		System.out.println("-------------------");
	}

}

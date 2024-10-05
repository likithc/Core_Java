package com.xyz.basicsofprogramming.day13;

import java.util.Scanner;

public class Farmer{
	double principle;
	static double rate;
	double time;
	double simple_interest;
	static {
		rate = 8.976;
	}
	
	public void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount");
		principle = sc.nextDouble();
		System.out.println("Enter time required");
		time = sc.nextDouble();
		
	}
	public void calculate() {
		simple_interest = (principle*rate*time)/100;
	}
	public void display() {
		System.out.println("the simple interest is :" +simple_interest);
	}

}

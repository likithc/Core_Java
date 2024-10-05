package com.xyz.basicsofprogramming.day11;

public class Dog {
	String name;
	String color;
	int cost;
	int age;
	
	public void addData() {
		name = "rocky";
		color = "brown";
		age = 4;
		cost = 4000;
	}
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
	}
}

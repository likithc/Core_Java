package com.xyz.basicsofprogramming.day36;

class Tiger{
	String name;
	String color;
	int age;
	String country;
	
	
	//zerp parameterized
	public Tiger() {
		System.out.println("Hi from constructor");
	}
}

public class ConstructorCode1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Tiger t = new Tiger();
	}
}

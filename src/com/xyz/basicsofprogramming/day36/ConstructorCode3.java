package com.xyz.basicsofprogramming.day36;

class Tiger2 extends Object
{
	String name;
	String color;
	int age;
	String country;
	
	public Tiger2(){
		super();
		System.out.println("Hi from zero parameterized constructor");
	}
}

public class ConstructorCode3 {

	public static void main(String[] args) {
		Tiger2 t2 = new Tiger2();
	}

}

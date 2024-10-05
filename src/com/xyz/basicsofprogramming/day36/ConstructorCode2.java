package com.xyz.basicsofprogramming.day36;

class Tiger1{
	String name;
	String color;
	int age;
	String country;
	
	public Tiger1() {
		System.out.println("Hi from zero parametrized constructor");
	}
	public Tiger1(String name) {
		this.name = name;
		System.out.println("Hi from single parametrized constructor");
	}
	public Tiger1(String name,String color) {
		this.name = name;
		this.color = color;
		System.out.println("Hi from two parametrized constructor");
	}
	public Tiger1(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("Hi from three parametrized constructor");
	}
	public Tiger1(String name,String color,int age,String country) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.country = country;
		System.out.println("Hi from four parametrized constructor");
	}
}


public class ConstructorCode2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Tiger1 t1 = new Tiger1();
		Tiger1 t2 = new Tiger1("Nigga");
		Tiger1 t3 = new Tiger1("lion", "black");
		Tiger1 t4 = new Tiger1("samu","pink",2);
		Tiger1 t5 = new Tiger1("ramu","white",3,"India");
		
	}
}

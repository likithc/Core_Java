package com.xyz.basicsofprogramming.day36;

class Tiger3{
	String name;
	String color;
	int age;
	String country;
	
	public Tiger3() {
		this("Tommy");
		this.name = "july";
		this.color = "orange";
		this.country = "India";
		this.age = 11;
		
		System.out.println("Hi from zero parametrized constructor");
	}
	public Tiger3(String name) {
		this("rocky","brown");
		this.name = name;
		System.out.println("Hi from single parametrized constructor");
	}
	public Tiger3(String name,String color) {
		this("hummy","black",2);
		this.name = name;
		this.color = color;
		System.out.println("Hi from two parametrized constructor");
	}
	public Tiger3(String name,String color,int age) {
		this("nigga","dark",6,"africa");
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("Hi from three parametrized constructor");
	}
	public Tiger3(String name,String color,int age,String country) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.country = country;
		System.out.println("Hi from four parametrized constructor");
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
}

public class ConstructorCode4 {
	public static void main(String[] args) {
		Tiger3 t3 = new Tiger3();
		System.out.println(t3.getName());
		System.out.println(t3.getColor());
		System.out.println(t3.getAge());
		System.out.println(t3.getCountry());
		
	}
}

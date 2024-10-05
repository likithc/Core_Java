package com.xyz.basicsofprogramming.day35;

class Dog{
	//step -1 to encp pro using private
	// these variables cannot be accessed directly outside class
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;
	
	//step -2 to encp pro by adding setter method
	void setData() {
		name ="nigga";
		color ="black";
		breed= "GR";
		cost = 5000;
		age = 10;
	}
	//step -3 to encp pro by adding getter method
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(cost);
	}
}

public class EncapCode1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		//d1.name= "nigro";
		d1.setData();
		d1.getData();
	}

}

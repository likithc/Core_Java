package com.xyz.basicsofprogramming.day37;

class Animal{
	String name;
	String color;
	String country;
	int age;
	
	public Animal() {
		super();
		this.name="Arjuna";
		this.color="black";
		this.age=8;
		this.country="AFRICA";
	}			
//		System.out.println(getname());
//		System.out.println(getcolor());
//		System.out.println(getcountry());
//		System.out.println(getage());
		

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getCountry() {
		return country;
	}

	public int getAge() {
		return age;
	}
}
	
	class Elephant extends Animal{
			public Elephant() {
				super();
				this.name="Arjuna";
				this.color="black";
				this.age=8;
				this.country="AFRICA";
			}
		}
	
public class InheritanceCode6 {

	public static void main(String[] args) {
		Elephant e =new Elephant();
		System.out.println(e.getName());
		System.out.println(e.getColor());
		System.out.println(e.getAge());
		System.out.println(e.getCountry());
	}

}

package com.xyz.basicsofprogramming.day35;

class Dog{
	//step -1 to encp pro using private
	// these variables cannot be accessed directly outside class
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;
	
	void setName(String s) {
		name =s;
	}
	void setColor(String s) {
		name =s;
	}
	void setBreed(String s) {
		name =s;
	}
	void setCost(int c) {
		cost =c;
	}
	void setAge(int c) {
		age =c;
	}

	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	String getBreed() {
		return breed;
	}
	int getCost(){
		return cost;
	}
	int getAge(){
		return age;
	}
	
	public class EncapCode2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		
	}

}
}

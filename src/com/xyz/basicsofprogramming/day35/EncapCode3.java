package com.xyz.basicsofprogramming.day35;

class dog2{
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;
	
	void setData(String name,String color,String breed,int cost,int age) {
		name = name;
		color = color;
		breed =breed;
		cost = cost;
		age = age;
	}
	void setName(String s) {
		name = name;
	}
	void setColor(String s) {
		color = color;
	}
	void setBreed(String s) {
		breed = breed;
	}
	void setCost(int c) {
		cost = cost;
	}
	void setAge(int c) {
		age =age;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
		
	}
	
	String getName() {
		return name;
	}
	String getColor() {
		return name;
	}
	String getBreed() {
		return name;
	}
	int getCost(){
		return cost;
	}
	int getAge(){
		return age;
	}
}

public class EncapCode3 {

	public static void main(String[] args) {
		dog2 d2= new dog2();
		//generic setter
		d2.setData("nigga", "black", "GR", 6000, 12);
		////generic getter
		d2.getData();
		System.out.println("--------------------------------");
		//specific setter
		d2.setName("nigga");
		d2.setColor("black");
		d2.setBreed("GR");
		d2.setCost(6000);
		d2.setAge(9);
		//specific getter
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		System.out.println(d2.getAge());
		
		
		
		
	}

}

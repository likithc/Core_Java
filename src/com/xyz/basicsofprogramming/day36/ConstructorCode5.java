package com.xyz.basicsofprogramming.day36;

class Animal{
	Animal(){
		System.out.println("Hi from zero parametarized constructor");
	}
	Animal(String name){
		System.out.println("Hi from one parametarized constructor");
	}
}
class Lion extends Animal{
	public Lion() {
		super();
		System.out.println("Hi from zero parametarized constructor");
	}
	public Lion(String name) {
		super(name);
		System.out.println("Hi from one parametarized constructor");
	}
//	public Lion(String name,String country) {
//		super(name,country);
//}
}

public class ConstructorCode5 {
	public static void main(String[] args) {
		Lion l1 = new Lion();
		Lion l2 = new Lion("hi");
	}
}


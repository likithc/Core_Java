package com.xyz.basicsofprogramming.day39;

import com.xyz.basicsofprogramming.day37.override;

class animals{
	void walk() {
		System.out.println("Animals are walking");
	}
	void eat() {
		System.out.println("Animals are eating");
	}
	void run() {
		System.out.println("Animals are running");
	}
}
class Elephants extends animals{
	@override
	void eat() {
		System.out.println("Elephant is eating plants");
	}
}
class Lion extends animals{
	@override
	void eat() {
		System.out.println("lion is eating pig");
	}
}
class Monkey extends animals{
	@override
	void eat() {
		System.out.println("monkey is eating banana");
	}
	
}
public class PolymorphismCode3 {
	public static void main(String[] args) {
		Elephants e =new Elephants();
		Lion l = new Lion();
		Monkey m = new Monkey();
		
		System.out.println("This the representation of Elephant");
		e.walk();
		e.eat();
		e.run();	
		System.out.println("================");
		System.out.println("This the representation of lion");
		l.walk();
		l.eat();
		l.run();	
		System.out.println("================");

		System.out.println("This the representation of monkey");
		m.walk();
		m.eat();
		m.run();	
		System.out.println("================");

	}
}

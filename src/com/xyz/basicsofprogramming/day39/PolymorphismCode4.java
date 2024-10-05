package com.xyz.basicsofprogramming.day39;

class Forest{
	void hasAnimals(animals ref){
		ref.walk();
		ref.eat();
		ref.run();	
	}
}

public class PolymorphismCode4 {
	public static void main(String[] args) {
		Elephants e =new Elephants();
		Lion l = new Lion();
		Monkey m = new Monkey();
		Forest f = new Forest();
		
		System.out.println("This the representation of Elephant");
		f.hasAnimals(e);
		
		System.out.println("This the representation of lion");
		f.hasAnimals(l);
		
		System.out.println("This the representation of monkey");
		f.hasAnimals(m);
}
}

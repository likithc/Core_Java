package com.xyz.basicsofprogramming.day39;

abstract class Parent{
	abstract void eatFood();
	void sleep() {
		System.out.println("Sleep for minimum 8hrs");
	}
	void work() {
		System.out.println("work for minimum 8hrs");
	}
	abstract void exercise();
}
class Child1 extends Parent{
	@Override
	void eatFood() {

	}
	@Override
	void exercise() {
		
	}
}
abstract class Child2 extends Parent{
	
}

public class AbstractionCode1 {

}

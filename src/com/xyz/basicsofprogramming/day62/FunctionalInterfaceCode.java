package com.xyz.basicsofprogramming.day62;

@FunctionalInterface
interface Calculator{
	void add();
	default void sub() {

	}
	default void mul() {

	}
	static void mod() {

	}
	int a =10;
	int b=20;
}

public class FunctionalInterfaceCode {
	public static void main(String[] args) {
		Calculator c = new Calculator() {
			@Override
			public void add() {
				
			}
		};
		System.out.println(c);
		
	}
}

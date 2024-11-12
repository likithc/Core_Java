package com.xyz.basicsofprogramming.day66;

import java.io.Serializable;

public class Cricketer implements Serializable{
	String name;
	int id;
	int matches;
	int runs;
	int wickets;
	public Cricketer(String name, int id, int matches, int runs, int wickets) {
		super();
		this.name = name;
		this.id = id;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(matches);
		System.out.println(runs);
		System.out.println(wickets);
	}
}

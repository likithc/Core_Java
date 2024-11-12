package com.xyz.basicsofprogramming.day61;

import java.util.ArrayList;

class Cricket1{
	String name;
	String country;
	int runs;
	int matches;
	int wickets;


	public Cricket1(String name, String country, int runs, int matches, int wickets) {
		super();
		this.name = name;
		this.country = country;
		this.runs = runs;
		this.matches = matches;
		this.wickets = wickets;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getRuns() {
		return runs;
	}
	public int getMatches() {
		return matches;
	}
	public int getWickets() {
		return wickets;
	}
	@Override
	public String toString() {
		return "Cricket1 [name=" + name + ", country=" + country + ", runs=" + runs + ", matches=" + matches
				+ ", wickets=" + wickets + "]";
	}

	

}

public class LaunchCricket {

	public static void main(String[] args) {
		Cricket1 c1 = new Cricket1("Rohith","India",10000,200,20);
		Cricket1 c2 = new Cricket1("ABD","SA",9000,180,40);
		Cricket1 c3 = new Cricket1("Holder","WI",2000,150,300);
		
		ArrayList <Cricket1> al= new ArrayList<Cricket1>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
	}

}

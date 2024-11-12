package com.xyz.basicsofprogramming.day61;

import java.util.ArrayList;
import java.util.Collections;

class Cricket2 implements Comparable<Cricket2>{
	String name;
	String country;
	int runs;
	int matches;
	int wickets;


	public Cricket2(String name, String country, int runs, int matches, int wickets) {
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
		return "Cricket2 [name=" + name + ", country=" + country + ", runs=" + runs + ", matches=" + matches
				+ ", wickets=" + wickets + "]";
	}
	@Override
	public int compareTo(Cricket2 x) {
		if(this.wickets < x.wickets) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class LaunchCricket2 {
	public static void main(String[] args) {


		Cricket2 c1 = new Cricket2("Rohith","India",10000,200,20);
		Cricket2 c2 = new Cricket2("ABD","SA",9000,180,40);
		Cricket2 c3 = new Cricket2("Holder","WI",2000,150,300);

		ArrayList <Cricket2> al= new ArrayList<Cricket2>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
        Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}

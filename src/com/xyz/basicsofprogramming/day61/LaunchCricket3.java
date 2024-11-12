package com.xyz.basicsofprogramming.day61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricket3 {
	String name;
	String country;
	int runs;
	int matches;
	int wickets;


	public Cricket3(String name, String country, int runs, int matches, int wickets) {
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
		return "Cricket3 [name=" + name + ", country=" + country + ", runs=" + runs + ", matches=" + matches
				+ ", wickets=" + wickets + "]";
	}
}
	class Alpha implements Comparator<Cricket3>{
		@Override
		public int compare(Cricket3 c1, Cricket3 c2) {
			if(c1.wickets < c2.wickets) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}


public class LaunchCricket3 {
	public static void main(String[] args) {


		Cricket3 c1 = new Cricket3("Rohith","India",10000,200,20);
		Cricket3 c2 = new Cricket3("ABD","SA",9000,180,40);
		Cricket3 c3 = new Cricket3("Holder","WI",2000,150,300);

		ArrayList <Cricket3> al= new ArrayList<Cricket3>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		Alpha a = new Alpha();

		Collections.sort(al,a);

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}



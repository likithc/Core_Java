package com.xyz.basicsofprogramming.day43;

class heart{
	float weight;
	int heart_beat_count;
	public heart(float weight,int heart_beat_count) {
		super();
		this.weight = weight;
		this.heart_beat_count = heart_beat_count;
	}
	public float getweight() {
		return weight;
	}
	public int getheart_beat_count() {
		return heart_beat_count;
	}
}
class brain{
	float weight;
	int iq_level;
	public brain(float weight,int iq_level) {
		super();
		this.weight = weight;
		this.iq_level = iq_level;
	}
	public float getweight() {
		return weight;
	}
	public int getiq_level() {
		return iq_level;
	}
}
class bike{
	String name;
	int cost;
	public bike(String name ,int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getname() {
		return name;
	}
	public int getcost() {
		return cost;
	}
}
class watch{
	String brand;
	int cost;
	public watch(String brand ,int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	public String getbrand() {
		return brand;
	}
	public int getcost() {
		return cost;
	}
}

class student{
	heart h = new heart(65.4f,70);
	brain b = new brain(65.5f,100);
	void hasbike(bike bk) {
		System.out.println(bk.getname());
		System.out.println(bk.getcost());
	}
	void haswatch(watch w) {
		System.out.println(w.getbrand());
		System.out.println(w.cost);
	}
}

public class HasCode2 {
	public static void main(String[] args) {
		student s = new student();
		bike bk = new bike("bmw",5000);
		watch w = new watch("rado",4000);
		System.out.println("Representation using enclosing object");
		System.out.println(s.h.getweight());
		System.out.println(s.h.getheart_beat_count());
		s.hasbike(bk);
		s.haswatch(w);
		System.out.println("=========");
		s=null;
		System.out.println("Representation without using enclosing object");
		System.out.println(bk.getname());
		System.out.println(bk.getcost());
		System.out.println(w.getbrand());
		System.out.println(w.getcost());
		System.out.println("=========");
		System.out.println(s.h.getweight());
		System.out.println(s.h.getheart_beat_count());
		s.hasbike(bk);
		s.haswatch(w);


	}
}

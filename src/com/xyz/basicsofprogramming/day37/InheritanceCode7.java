package com.xyz.basicsofprogramming.day37;

class plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane landed");
	}
}
class CargoPlane extends plane{
	@override
	void fly() {
		System.out.println("cargo plane is flying at low height");
	}
	void carryGoods() {
		System.out.println("cargo plane is carrying goods");
	}
}
class PassengerPlane extends plane{
	@override
	void fly() {
		System.out.println("passenger plane is flying at medium height");
	}
	void carryHumans() {
		System.out.println("passenger plane is carrying humans");
	}
}
class fighterPlane extends plane{
	@override
	void fly() {
		System.out.println("fighter plane is flying at great height");
	}
	void carryWeapons() {
		System.out.println("fighter plane is carrying weapons");
	}
}
public class InheritanceCode7 {
	public static void main(String[] args) {
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		fighterPlane fp = new fighterPlane();
		
		System.out.println("This the representation of cargo plane");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		 
		System.out.println("This the representation of passenger plane");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		
		System.out.println("This the representation of fighter plane");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}
}

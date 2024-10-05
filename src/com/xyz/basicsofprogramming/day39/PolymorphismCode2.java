package com.xyz.basicsofprogramming.day39;

class Airport{
	void permit(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class PolymorphismCode2 {
	public static void main(String[] args) {
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		fighterPlane fp = new fighterPlane();
		Airport a = new Airport();
		System.out.println("This the representation of cargo plane");
		a.permit(cp);
		cp.carryGoods();
		 System.out.println("=================================");
		System.out.println("This the representation of passenger plane");
		a.permit(pp);
		pp.carryHumans();
		System.out.println("=================================");
		System.out.println("This the representation of fighter plane");
		a.permit(fp);
		fp.carryWeapons();
		System.out.println("=================================");
	}
}

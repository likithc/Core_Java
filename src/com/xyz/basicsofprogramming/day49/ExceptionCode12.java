package com.xyz.basicsofprogramming.day49;

import java.util.Scanner;

class UnderAge extends Exception{
	public String getMessage() {
		return "You are young to apply for DL";
	}
}
class OverAge extends Exception{
	public String getMessage() {
		return "You are old to apply for DL";
	}
}

class Customer1{
	int age;


	void getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		
	}
	void Verify() throws UnderAge,OverAge{
		if(age>18){
			if(age<60) {
			System.out.println("Valid age");
		}
		
		else{
			UnderAge icpe = new UnderAge();
			System.out.println(icpe.getMessage());
			throw icpe;
		}
		}
		else {
			OverAge icp = new OverAge();
			System.out.println(icp.getMessage());
			throw icp;
		}
	}
}

class RTO{
	void Customer1Ops(Customer c){
		c.getAge();
	}
}
public class ExceptionCode12 {

}

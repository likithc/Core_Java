package com.xyz.basicsofprogramming.day49;

import java.util.Scanner;

class InvalidCustomerAccnoException extends Exception{
	public String getMessage() {
		return "Inalid accno. Please try again!!!";
	}
}
class InvalidCustomerPasswordException extends Exception{
	public String getMessage() {
		return "Inalid password. Please try again!!!";
	}
}
class Customer{
	int accno;
	int pwd;
	static int accno_main;
	static int pwd_main;
	
	static {
		accno_main =111;
		pwd_main =222;
	}
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accno :");
		accno=sc.nextInt();
		System.out.println("Enter the password :");
		pwd=sc.nextInt();
	}
	void verify() throws InvalidCustomerAccnoException,InvalidCustomerPasswordException{
		if(accno==accno_main) {
			if(pwd==pwd_main) {
				System.out.println("Valid user");
			}
			else {
				InvalidCustomerPasswordException icpe = new InvalidCustomerPasswordException();
				System.out.println(icpe.getMessage());
				throw icpe;
				
			}
		}
		else {
			InvalidCustomerAccnoException icae = new InvalidCustomerAccnoException();
			System.out.println(icae.getMessage());
			throw icae;
		}
	}
}
class Bank{
	void customerOps(Customer c) {
		try {
			c.getDetails();
			c.verify();
		}
		catch(InvalidCustomerAccnoException | InvalidCustomerPasswordException e1) {
			try {
				c.getDetails();
				c.verify();
			}
			catch(InvalidCustomerAccnoException | InvalidCustomerPasswordException e2) {
				try {
					c.getDetails();
					c.verify();
				}
				catch(InvalidCustomerAccnoException | InvalidCustomerPasswordException e3) {
					System.out.println("User is blocked.Visit the nearst bank");
					System.exit(0);
		}
	}
}
	}
}

public class ExceptionCode11 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Customer c = new Customer();
		b.customerOps(c);
	}
}

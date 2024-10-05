package com.xyz.basicsofprogramming.day14;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age <18) {
			System.out.println("yiu are a kid");
		}
		else if(age>60) {
			System.out.println("you are senior");
		}
		else {
			System.out.println("get married");
		}
		
		
		System.out.println("SWITCH CASE");
		System.out.println("enter num1");
		int num1 =sc.nextInt();
		System.out.println("enter num2");
		int num2 =sc.nextInt();
		System.out.println("Enter your choice"+ "1.Add /n" + "2.sub /n" + "3.multiply /n" + "4.divide /n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : {
			System.out.println("addition selected");
			System.out.println(num1+num2);
			break;
		}
		case 2 : {
			System.out.println("subtraction selected");
			System.out.println(num1-num2);
			break;
		}
		case 3 : {
			System.out.println("multiplication selected");
			System.out.println(num1*num2);
			break;
		}
		case 4 : {
			System.out.println("division selected");
			System.out.println(num1/num2);
			break;
		}
		default :
			System.out.println("wrong choice");
		    break;
	}
		
		
		System.out.println("Nested if --else");
		int accno = 111;
		int pwd = 222;
		int accno_new;
		int pwd_new;
		
		System.out.println("enter account number");
		accno_new = sc.nextInt();
		System.out.println("enter password");
		pwd_new = sc.nextInt();
		
		if(accno==accno_new) {
			if(pwd==pwd_new) {
				System.out.println("credentials are valid");
			}
				else {
					System.out.println("invalid password");
				}
			}
			else {
				System.out.println("invalid accno");
			}
		}
		

}

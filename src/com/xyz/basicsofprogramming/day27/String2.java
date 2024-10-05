package com.xyz.basicsofprogramming.day27;

public class String2 {
	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "RaMA";
		
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("strings are equal");
		}
			else {
				System.out.println("not equal");
			
		}
		
		System.out.println("==================");
		
		if(s1==s2) {
			System.out.println("address not equal");
		}
		else {
			System.out.println("address not equal");
		}
	}


	}

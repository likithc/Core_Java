package com.xyz.basicsofprogramming.day34;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("SITA");
		StringBuffer sb2 = new StringBuffer("RAMA");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println("=====================");
		StringBuilder sbu1 = new StringBuilder("SITA");
		StringBuilder sbu2 = new StringBuilder("RAMA");
		sbu1.append(sbu2); 
		System.out.println(sbu1);
	}

}

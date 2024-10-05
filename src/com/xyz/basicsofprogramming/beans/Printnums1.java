package com.xyz.basicsofprogramming.beans;

public class Printnums1 {
	public static void main(String[] args) {
		        // Loop from 1 to 9
		        for (int i = 1; i <= 9; i++) {
		            // Inner loop to print 'i', 'i' times
		            for (int j = 1; j <= i; j++) {
		                System.out.print(i + " ");
		            }
		            // Move to the next line after printing each number 'i' times
		            System.out.println();
		        }
		        System.out.println("=================");
		        System.out.println("reverse");
		        for(int i=9;i>=1;i--) {
		        	for(int j=1;j<=i;j++) {
		        		System.out.print(i + " ");
		        	}
		        	System.out.println();
		        }
		    }
		}


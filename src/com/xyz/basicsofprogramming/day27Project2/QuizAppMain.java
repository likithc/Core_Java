package com.xyz.basicsofprogramming.day27Project2;
import java.util.Scanner;
public class QuizAppMain {
	public static void main(String[] args) {
		System.out.println("Welcome to quiz application");
		System.out.println("=============================================================");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("\n");
			System.out.println("Question 1  : 10000 points");
			System.out.println("Question 2  : 50000 points");
			System.out.println("Question 3  : 100000 points");
			System.out.println("Question 4  : 500000 points");
			System.out.println("Question 5  : 1000000 points");
			System.out.println("Question 6  : 1500000 points");
			System.out.println("Question 7  : 2500000 points");
			System.out.println("Question 8  : 5000000 points");
			System.out.println("Question 9  : 7500000 points");
			System.out.println("Question 10 : 10000000 points");
			System.out.println("\n");
			System.out.println("You have two Life Lines in this game: \n"
					 + "1. Audiance Phone\n"
					 + "2. 50-50\n");
			
			boolean res;
			Questions q = new Questions();
			
			System.out.println("Do you wish to start the game?(Y/N)");
			String resp1 = sc.next();
			System.out.println("==================================================================");
			if(resp1.equalsIgnoreCase("y")) {
				res = q.question1(name);
				if(res==true) {
					System.out.println("Here comes your Second Question.");
					res = q.question2(name);
					
				
					if(res==true) {
						System.out.println("Here comes your Third Question.");
						res = q.question3(name);
						
						if(res==true) {
							System.out.println("Here comes your Fourth Question.");
							res = q.question4(name);
							
							if(res==true) {
								System.out.println("Here comes your Fifth Question.");
								res = q.question5(name);
								
								if(res==true) {
									System.out.println("Here comes your sixth Question.");
									res = q.question6(name);
									
									if(res==true) {
										System.out.println("Here comes your seventh Question.");
										res = q.question7(name);
										
										if(res==true) {
											System.out.println("Here comes your Eighth Question.");
											res = q.question8(name);
											
											if(res==true) {
												System.out.println("Here comes your Ninth Question.");
												res = q.question9(name);
												
												if(res==true) {
													System.out.println("Here comes your Tenth Question.");
													res = q.question10(name);
						                            System.exit(0);
						                         }
												
					else {
						System.out.println("Thank You.");
						System.exit(0);
					    }
				      }
				         else {
				 	     System.out.println("Thank You.");
					     System.exit(0);
				         }
			           }
			                  else {
				              System.out.println("Thank You.");
				              System.exit(0);
			                  }
			                }
			                       else {
				                   System.out.println("Thank You.");
				                   System.exit(0);
			                       }
			                      }
			                            else {
				                        System.out.println("Thank You.");
				                        System.exit(0);
			                            }
			                          }
			                                 else {
				                             System.out.println("Thank You.");
				                             System.exit(0);
			                                 }
			                                }
			                                      else {
				                                  System.out.println("Thank You.");
				                                  System.exit(0);
			                                      }
			                                     }
			                                           else {
				                                       System.out.println("Thank You.");
				                                       System.exit(0);
			                                           }
			                                         }
			                                                else {
				                                            System.out.println("Thank You.");
				                                            System.exit(0);
			                                                }
			                                              }
			                                                     else {
				                                                 System.out.println("Thank You.");
				                                                 System.exit(0);
			                                                     }
		}
		System.exit(0);
	}

}
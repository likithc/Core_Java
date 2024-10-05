package com.xyz.basicsofprogramming.day27Project;

import java.util.Random;
import java.util.Scanner;

public class SimpleQuizApp {
		    public static void main(String[] args) {
		        
		        int[] correctAnswers = {3, 3, 2, 3, 1, 2, 1, 3, 2, 1};  

		        
		        int score = 0;
		        boolean lifelineUsed = false;  
		        Scanner scanner = new Scanner(System.in);

		        
		        for (int i = 0; i < 10; i++) {
		            
		            if (i == 0) {
		                System.out.println("Question 1: What is the capital of France?");
		                System.out.println("1: Berlin");
		                System.out.println("2: Madrid");
		                System.out.println("3: Paris");
		                System.out.println("4: Rome");
		            } else if (i == 1) {
		                System.out.println("Question 2: Which planet is known as the Red Planet?");
		                System.out.println("1: Earth");
		                System.out.println("2: Venus");
		                System.out.println("3: Mars");
		                System.out.println("4: Jupiter");
		            } else if (i == 2) {
		                System.out.println("Question 3: What is the largest ocean on Earth?");
		                System.out.println("1: Atlantic Ocean");
		                System.out.println("2: Pacific Ocean");
		                System.out.println("3: Indian Ocean");
		                System.out.println("4: Arctic Ocean");
		            } else if (i == 3) {
		                System.out.println("Question 4: Who wrote 'Hamlet'?");
		                System.out.println("1: Charles Dickens");
		                System.out.println("2: J.K. Rowling");
		                System.out.println("3: William Shakespeare");
		                System.out.println("4: Mark Twain");
		            } else if (i == 4) {
		                System.out.println("Question 5: Which element has the chemical symbol 'O'?");
		                System.out.println("1: Oxygen");
		                System.out.println("2: Hydrogen");
		                System.out.println("3: Carbon");
		                System.out.println("4: Nitrogen");
		            } else if (i == 5) {
		                System.out.println("Question 6: Which is the longest river in the world?");
		                System.out.println("1: Amazon River");
		                System.out.println("2: Nile River");
		                System.out.println("3: Mississippi River");
		                System.out.println("4: Yangtze River");
		            } else if (i == 6) {
		                System.out.println("Question 7: Which planet is closest to the Sun?");
		                System.out.println("1: Mercury");
		                System.out.println("2: Venus");
		                System.out.println("3: Earth");
		                System.out.println("4: Mars");
		            } else if (i == 7) {
		                System.out.println("Question 8: Which country has the largest population?");
		                System.out.println("1: United States");
		                System.out.println("2: Indonesia");
		                System.out.println("3: China");
		                System.out.println("4: India");
		            } else if (i == 8) {
		                System.out.println("Question 9: Which is the largest mammal?");
		                System.out.println("1: Blue Whale");
		                System.out.println("2: Elephant");
		                System.out.println("3: Giraffe");
		                System.out.println("4: Rhinoceros");
		            } else if (i == 9) {
		                System.out.println("Question 10: What is the smallest country in the world by land area?");
		                System.out.println("1: Vatican City");
		                System.out.println("2: Monaco");
		                System.out.println("3: Malta");
		                System.out.println("4: San Marino");
		            }

		            
		            if (!lifelineUsed) {
		                System.out.println("Press 5 to use the 50:50 lifeline (you can use this only once).");
		            }

		            
		            int input = scanner.nextInt();

		            
		            if (input == 5 && !lifelineUsed) {
		                lifelineUsed = true;
		                Random random = new Random();
		                int correctAnswer = correctAnswers[i];
		                int wrongOption;

		                
		                do {
		                    wrongOption = random.nextInt(4) + 1;  
		                } while (wrongOption == correctAnswer);

		                System.out.println("50:50 Lifeline Activated! Here are the two options:");
		                System.out.println("1: Option " + correctAnswer);
		                System.out.println("2: Option " + wrongOption);

		                
		                input = scanner.nextInt();

		                
		                if (input == 1) {
		                    input = correctAnswer;
		                } else {
		                    input = wrongOption;
		                }
		            }

		            
		            if (input == correctAnswers[i]) {
		                score += 10;  
		                System.out.println("Correct! You've earned 10 points. Your score: " + score);
		            } else {
		                System.out.println("Wrong answer! The correct answer was Option " + correctAnswers[i]);
		            }

		            System.out.println("-------------------------");
		        }

		        
		        System.out.println("Quiz Over! Your final score is: " + score);
		        scanner.close();
		    }
		
	}



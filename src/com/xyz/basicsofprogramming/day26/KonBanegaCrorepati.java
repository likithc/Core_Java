package com.xyz.basicsofprogramming.day26;

import java.util.Random;
import java.util.Scanner;

public class KonBanegaCrorepati {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Array of questions
	        String[] questions = {
	                "Q1: Who is the current Prime Minister of India?",
	                "Q2: Which is the largest planet in our solar system?",
	                "Q3: Who wrote the famous book '1984'?",
	                "Q4: What is the capital of France?",
	                "Q5: Which is the longest river in the world?",
	                "Q6: What is the chemical symbol for Gold?",
	                "Q7: Who is known as the 'Father of Computers'?",
	                "Q8: What is the boiling point of water?",
	                "Q9: Who painted the Mona Lisa?",
	                "Q10: Which is the largest desert in the world?"
	        };

	        // Array of options for each question
	        String[][] options = {
	                {"1. Narendra Modi", "2. Rahul Gandhi", "3. Manmohan Singh", "4. Atal Bihari Vajpayee"},
	                {"1. Earth", "2. Jupiter", "3. Mars", "4. Venus"},
	                {"1. George Orwell", "2. J.K. Rowling", "3. Mark Twain", "4. William Shakespeare"},
	                {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
	                {"1. Amazon", "2. Nile", "3. Ganga", "4. Yangtze"},
	                {"1. Au", "2. Ag", "3. Fe", "4. Hg"},
	                {"1. Alan Turing", "2. Charles Babbage", "3. Bill Gates", "4. Steve Jobs"},
	                {"1. 100°C", "2. 50°C", "3. 200°C", "4. 150°C"},
	                {"1. Leonardo da Vinci", "2. Pablo Picasso", "3. Vincent van Gogh", "4. Michelangelo"},
	                {"1. Sahara", "2. Gobi", "3. Kalahari", "4. Arabian"}
	        };

	        // Array of correct answers (1-based index)
	        int[] correctAnswers = {1, 2, 1, 3, 2, 1, 2, 1, 1, 1};

	        // Array of rewards for each correct answer
	        int[] rewards = {1000, 2000, 5000, 10000, 20000, 50000, 100000, 500000, 1000000, 5000000};

	        int totalReward = 0; // Total amount won by the contestant
	        boolean lifelineUsed = false; // Track if 50-50 lifeline has been used

	        // Start the game
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i]);

	            // Display the options
	            for (String option : options[i]) {
	                System.out.println(option);
	            }

	            // Ask if they want to use 50-50 lifeline, but only if it hasn't been used
	            if (!lifelineUsed) {
	                System.out.print("Do you want to use the 50-50 lifeline? (yes/no): ");
	                String useLifeline = scanner.next();
	                if (useLifeline.equalsIgnoreCase("yes")) {
	                    lifelineUsed = true; // Mark lifeline as used

	                    // Randomly remove two incorrect options
	                    int correctAnswer = correctAnswers[i];
	                    int firstIncorrectOption, secondIncorrectOption;

	                    // Generate two unique incorrect options
	                    do {
	                        firstIncorrectOption = random.nextInt(4) + 1;
	                    } while (firstIncorrectOption == correctAnswer);

	                    do {
	                        secondIncorrectOption = random.nextInt(4) + 1;
	                    } while (secondIncorrectOption == correctAnswer || secondIncorrectOption == firstIncorrectOption);

	                    // Display remaining two options (one correct and one random incorrect option)
	                    System.out.println("50-50 Lifeline used! Here are your remaining options:");
	                    System.out.println(correctAnswer + ". " + options[i][correctAnswer - 1]);
	                    System.out.println(firstIncorrectOption + ". " + options[i][firstIncorrectOption - 1]);
	                }
	            }

	            // Get the answer from the contestant
	            System.out.print("Your answer (1-4): ");
	            int answer = scanner.nextInt();

	            // Check if the answer is correct
	            if (answer == correctAnswers[i]) {
	                totalReward += rewards[i]; // Add reward for the correct answer
	                System.out.println("Correct! You've won ₹" + rewards[i]);
	                System.out.println("Your total reward is ₹" + totalReward);

	                // Ask the contestant if they want to continue
	                System.out.print("Do you want to continue? (yes/no): ");
	                String continueGame = scanner.next();

	                if (!continueGame.equalsIgnoreCase("yes")) {
	                    System.out.println("You've chosen to exit the game.");
	                    break;
	                }

	            } else {
	                // Wrong answer, exit the game
	                System.out.println("Wrong answer! You've lost the game.");
	                System.out.println("Your total reward is ₹" + totalReward);
	                break;
	            }
	        }

	        // End the game
	        System.out.println("Game Over! You won a total of ₹" + totalReward);
	        scanner.close();
	    }
	}
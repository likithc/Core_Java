package com.xyz.basicsofprogramming.test11;

//amount=450,how many minimum number of notes


public class test1 {
	public class Denominations {
	    public static void main(String[] args) {
	        int amount = 450;
	        int[] denominations = {1, 5, 10, 20, 50, 100};  // Example denominations

	        System.out.println("Number of possible ways to make " + amount + " is: " + countWays(denominations, amount));
	    }

	    public static int countWays(int[] denominations, int amount) {
	        int[] dp = new int[amount + 1];  // Create an array to store the results
	        dp[0] = 1;  // There is one way to make 0 amount (by using no coins)

	        // Loop through each denomination and update the dp array
	        for (int coin : denominations) {
	            for (int i = coin; i <= amount; i++) {
	                dp[i] += dp[i - coin];
	            }
	        }

	        return dp[amount];  // The result will be the value of dp[amount]
	    }
	}
}

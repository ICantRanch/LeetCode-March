package LeetCode.March;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(coinChange(new int[] {186,419,83,408},6249));
	}

	public static int coinChange(int[] coins, int amount) {

		int[] totals = new int[amount+1];

		Arrays.fill(totals, amount+1);
		totals[0] = 0;
		for(int i = 0;i < coins.length;i++){
			if(coins[i] <= amount) {
				totals[coins[i]] = 1;
			}
		}
		
		return minCoins(amount,coins,totals); 
	}

	public static int minCoins(int amount,int[] coins,int[] totals) {


		//Find out why its struggling with these larger nums
		//If an amount is impossible to reach, make if -1 to distingush non-iterated elements
		
		if(totals[amount] < amount+1) {
			return totals[amount];
		}
		int temp = totals[amount];
		int min;
		for (int i = 0; i < coins.length; i++) {
			if(amount >= coins[i]) {
				min = minCoins(amount-coins[i],coins,totals);
				if(min != -1) {
					totals[amount] = Math.min(totals[amount], min+1);
				}		
			}
		}
		//Integrate this with the return method so it doesn't screw up the min function
		if(totals[amount] == temp) {totals[amount] = -1;}
		
		System.out.printf("Totals[%d]:%d\n",amount,totals[amount]);
		return totals[amount];
	}

}

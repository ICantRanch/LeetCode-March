package LeetCode.March;

import java.util.Random;

public class MaxProfit {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices, int fee) {

		//consider 2 states, one the day before if you do have stock and one where you dont
		//dynamic programming
		//Have 2 arrays, one where each day has max profit with stock and another without
		
		int[] yStock = new int[prices.length];
		int[] nStock = new int[prices.length];
		
		yStock[0] = -prices[0];
		nStock[0] = 0;
		
		for (int i = 1; i < prices.length; i++) {
			yStock[i] = Math.max(nStock[i-1]-prices[i],yStock[i-1]);
			nStock[i] = Math.max(yStock[i-1]+prices[i]-fee,nStock[i-1]);
		}

		return nStock[prices.length-1];
		
		//Dont need entire arrays, just max profit for yesterday with and without stock
	}
}

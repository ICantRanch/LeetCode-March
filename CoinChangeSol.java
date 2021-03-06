package LeetCode.March;

public class CoinChangeSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(coinChange(new int[] {186,419,83,408},6249));
		
	}

	
	public static int coinChange(int[] coins, int amount) {
	    if (amount < 1) return 0;
	    return coinChange(coins, amount, new int[amount]);
	  }

	  private static int coinChange(int[] coins, int rem, int[] count) {
	    if (rem < 0) return -1;
	    if (rem == 0) return 0;
	    if (count[rem - 1] != 0) return count[rem - 1];
	    int min = Integer.MAX_VALUE;
	    for (int coin : coins) {
	      int res = coinChange(coins, rem - coin, count);
	      if (res >= 0 && res < min)
	        min = 1 + res;
	    }
	    count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
	    return count[rem - 1];
	  }
}

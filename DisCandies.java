package LeetCode.March;

public class DisCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(distributeCandies(new int[] {1,1,2,2,3,3}));

	}
	
	public static int distributeCandies(int[] can) {
		
		if(can.length < 1) {
			return 0;
		}
		int unique = 1;
		
		for (int i = 1; i < can.length; i++) {
			if(can[i] != can[i-1]) {
				unique++;
			}
		}
		return Math.max(unique, can.length/2);
	}

}

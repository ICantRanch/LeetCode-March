package LeetCode.March;

import java.util.ArrayList;

public class PowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reorderedPowerOf2(64));
	}
	
	public static boolean reorderedPowerOf2(int n) {
        //check all powers of two that are the length of n.length and check if it contains all chars of n as a String
		
		String temp = Integer.toString((int)Math.pow(2, 0));
		ArrayList<String> avail = new ArrayList<>();
		String nStr = Integer.toString(n);
		int max = nStr.length();
		
		int i = 1;
		while(temp.length()<= max) {

			if(temp.length() == max) {
				avail.add(temp);
			}
			temp = Integer.toString((int)Math.pow(2, i));	
			i++;
		}
		System.out.println(avail);
		StringBuilder pow2;
		
		for (int j = 0; j < avail.size(); j++) {
			
			pow2 = new StringBuilder(avail.get(j));
			
			
			for (int j2 = 0; j2 < max; j2++) {
				
				int index = pow2.indexOf(""+nStr.charAt(j2));
				if(index != -1) {
					pow2.deleteCharAt(index);
					if(pow2.length() == 0) {
						System.out.println(avail.get(j));
						return true;
					}
				}else {
					avail.remove(j);
					j--;
					break;
				}
			}
		}	
		return false;
		
    }

}

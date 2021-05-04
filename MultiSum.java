package LeetCode.March;

import java.util.HashMap;
import java.util.Map;

public class MultiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int threeSumMulti(int[] arr, int target) {
        //Convert duplicates to hashmap of keys and how many times they show
        //Possibly use dynamic programming
		
		
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.get(i) != null) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		return target;
		
		
    }
	
	
	
	public static int getSums(int toSum,int first,int second,int third,HashMap<Integer,Integer> map) {
		
		int sum = 0;
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			
			
			
			
			
		}
		return sum;
		
	}

}

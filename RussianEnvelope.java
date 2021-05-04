package LeetCode.March;

import java.util.Arrays;
import java.util.Comparator;

public class RussianEnvelope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxEnvelopes(new int[][] {{5,4},{6,4},{6,7},{2,3}});
		
		
	}

	public static int maxEnvelopes(int[][] envelopes) {
		
		Arrays.sort(envelopes, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0]) {
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		
		int[] inserts = new int[envelopes.length];
		Arrays.fill(inserts, 1);
		
		for (int i = 0; i < envelopes.length; i++) {
			for (int j = i; j < envelopes.length; j++) {
				if(envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]) {
					inserts[j] = Math.max(inserts[i], inserts[j])+1;
				}
			}
		}
		int max = inserts[0];
		for (int i = 0; i < inserts.length; i++) {
			if(inserts[i] > max) {max = inserts[i];}
		}
		
		return max;
	}
}

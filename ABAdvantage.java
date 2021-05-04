package LeetCode.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ABAdvantage {
	
	
	public static class Element implements Comparable<Element>{

		int val;
		int index;
		
		public Element(int val, int index) {
			this.val = val;
			this.index = index;
		}
		public int compareTo(Element e) {
			return this.val - e.val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(advantageCount(new int[] {1,2,3,4,77,12},new int[] {5,1,11,8,2,55})));;
		
	}
	
	public static int[] advantageCount(int[] A, int[] B) {
		
		ArrayList<Element> bSort = new ArrayList<>();
		
		for (int i = 0; i < B.length; i++) {
			bSort.add(new Element(B[i],i));
		}
		Arrays.sort(A);
		Collections.sort(bSort);
		int[] result = new int[A.length];
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.print("[");
		for (int i = 0; i < bSort.size(); i++) {
			System.out.print(bSort.get(i).val + ", ");
		}
		System.out.print("]\n");
		
		
		for (int i = 0; i < A.length; i++) {
			
			if(A[i] > bSort.get(0).val) {

				for (int j = 1; j <= bSort.size(); j++) {

					if(j == bSort.size() || A[i] <= bSort.get(j).val) {

						result[bSort.get(j-1).index] = A[i];
						bSort.remove(j-1);
						break;
					}
				}	
			}else {
				result[bSort.get(bSort.size()-1).index] = A[i];
				bSort.remove(bSort.size()-1);
			}
		}
		return result;
	}

}

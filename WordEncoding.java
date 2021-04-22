package LeetCode.March;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class WordEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumLengthEncoding(new String[] {"fg","efg","g","defg","abcdefg","fg"});

	}
	
	public static int minimumLengthEncoding(String[] words) {
		
		String[] wSort = words;
		Arrays.sort(wSort, Comparator.comparingInt(String::length));
		
		LinkedList<String> l = new LinkedList<String>();
		for (String s : wSort) {
			l.add(s);
		}
		
		String result = "";
		
		while(l.size() != 0) {
			
			String temp = l.poll();
			boolean isContained = false;
			
			for (String s : l) {
				if(s.substring(s.length() - temp.length()).equals(temp)) {
					isContained = true;
					break;		
				}
			}
			if(!isContained) {
				result += temp + "#";
			}		
		}
		return result.length();
	}

}

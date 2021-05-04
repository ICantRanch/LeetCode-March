package LeetCode.March;

public class PalindromeRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		removePalindromeSub("aabbababbaba");
		
		
	}
	
	public static int removePalindromeSub(String s) {
		
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		if(str.equals(s) || s.length() == 1) {
			return 1;
		}else {
			return 2;
		}
	}

}

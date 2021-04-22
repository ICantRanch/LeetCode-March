package LeetCode.March;

public class PalindromeRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		removePalindromeSub("aabbababbaba");
		
		
	}
	
	public static int removePalindromeSub(String s) {
		
		int steps = 0;
		
		int start;
		int end;
		int length;
		
		
		while(s.length() > 0) {
			
			
			start = 0;
			end = 0;
			length = 0;
			
			if(s.length() == 1) {
				steps++;
				s = "";
				break;
			}
			
			
			
			for (int i = 0; i < s.length(); i++) {

				for (int j = 0; j < s.length(); j++) {

					if(j-i < length) {continue;}
					
					//Figure out this middle situation so they are separated evenly
					
					
					double middle = i + ((double)((j+1)-i)/2);

					System.out.println("\nMiddle: " + middle);			
					System.out.println("Test: " + s.substring(i, j+1));
					System.out.println("First Half: " + s.substring(i, (int)Math.floor(middle)));
					System.out.println("Second Half: " + s.substring((int)Math.ceil(middle),j+1));
					
					
					if(s.substring(i, (int)Math.floor(middle)).equals(s.substring((int)Math.ceil(middle),j+1))) {
						
						System.out.println("Found Palini");

							start = i;
							end = j;
							length = j-i;

					}
					
				}
			}
			System.out.printf("Start:%d, End:%d\n",start,end);
			System.out.println(s);
			s = s.substring(0,start) + s.substring(end);
			System.out.println(s);
			steps++;
		}
		
		
		
		
		return steps;
	}

}

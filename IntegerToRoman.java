package LeetCode.March;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(intToRoman(742));
		
		
	}
	
	public static String intToRoman(int num) {

		String result = "";
		
		while(num >= 1000) {
			num -= 1000;
			result += "M";
		}
		while(num >= 900) {
			num -= 900;
			result += "CM";
		}
		while(num >= 500) {
			num -= 500;
			result += "D";
		}
		while(num >= 400) {
			num -= 400;
			result += "CD";
		}
		while(num >= 100) {
			num -= 100;
			result += "C";
		}
		while(num >= 90) {
			num -= 90;
			result += "XC";
		}
		while(num >= 50) {
			num -= 50;
			result += "L";
		}
		while(num >= 40) {
			num -= 40;
			result += "XL";
		}
		while(num >= 10) {
			num -= 10;
			result += "X";
		}
		while(num >= 9) {
			num -= 9;
			result += "IX";
		}
		while(num >= 5) {
			num -= 5;
			result += "V";
		}
		while(num >= 4) {
			num -= 4;
			result += "IV";
		}
		while(num >= 1) {
			num -= 1;
			result += "I";
		}
		
		return result;
	}

}

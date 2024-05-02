package test;

/*
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class P9PalindromeNumber {

	public static boolean isPalindromNumber(int value) {
		String vstring = Integer.toString(value);
		String reversed = "";
		for (int i=0;i<vstring.length();i++) {
			reversed = vstring.substring(i, i+1)+reversed;
		}
		return vstring.equals(reversed);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("121:"+P9PalindromeNumber.isPalindromNumber(121));
		System.out.println("-121:"+P9PalindromeNumber.isPalindromNumber(-121));
		
	}
}

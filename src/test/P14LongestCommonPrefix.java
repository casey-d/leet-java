package test;

public class P14LongestCommonPrefix {
	
	public static String longestPrefix(String[] arr) {
		String result = "";
		
		//if it is a 1 item array, longest common prefix is itself, otherwise will get shorter
		if (arr.length>=1) {
			result = arr[0];
		}
		
		//progress thru rest of array items
		for (int i=1;i<arr.length;i++) {
			String newcommon = "";
			int rlength = result.length();
			String next = arr[i];
			int nextlength = next.length();
			//iterate over all the chars in the shortest
			for (int j=0;j<Math.min(rlength, nextlength);j++) {
				String nextchar = next.substring(j, j+1);
				if (nextchar.equalsIgnoreCase(result.substring(j, j+1))) {
					newcommon = newcommon + nextchar;
				}
				else {
					break;
				}
			}
			result = newcommon;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] test = {"flower","flow","flight"};
		System.out.println(P14LongestCommonPrefix.longestPrefix(test));
		
		String[] test2 = {"flower","flow",};
		System.out.println(P14LongestCommonPrefix.longestPrefix(test2));
		
		String[] test3 = {"dog","racecar","car"};
		System.out.println(P14LongestCommonPrefix.longestPrefix(test3));
		
	}

}

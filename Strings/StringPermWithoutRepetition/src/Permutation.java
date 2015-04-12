/*
 * http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 * Print all permutations of all given string
 * */

public class Permutation {

	public static void main(String args[]){
		String str = "ABC";
		PrintPermutation("", str);
	}

	private static void PrintPermutation(String prefix, String str) {
		if (str.length() == 0)
			System.out.println(prefix);
		else{
			for (int i=0; i<str.length(); i++){
				PrintPermutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1));
			}
		}
		
	}
}

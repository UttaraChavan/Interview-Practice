
public class permutation {

	public static void main(String args[]){
		String s = "ABC";
		
		GetPermutations("", s);
	}

	private static void GetPermutations(String prefix, String str) {
		if (prefix.length() == str.length()){
			System.out.println(prefix);
			return;
		}
		
		for (int i=0; i<str.length(); i++){
			GetPermutations(prefix+str.charAt(i), str);
		}
	}
}

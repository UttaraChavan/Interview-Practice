
public class SearchPatterns {

	public static void main(String args[]){
		//String str = "GeeksforGeeks";
		String str = "AAAAAAAAAAAA";
		//String pattern = "Geeks";
		String pattern = "AAA";
		
		int pattern_Code = pattern.hashCode();
		for (int i=0; i<=str.length()-pattern.length(); i++){
			if (str.substring(i, i+pattern.length()).hashCode() == pattern_Code)
				System.out.print(i + " ");
		}
	}
}

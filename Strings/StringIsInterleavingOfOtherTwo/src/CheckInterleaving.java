
public class CheckInterleaving {
	public static void main(String args[]){
		String a = "AB";
		String b = "CD";
		String c = "ADCB";
		
		if (IsInterleaving(a, b, c))
			System.out.println("Interleaving");
		else
			System.out.println("Not Interleaving");
	}

	private static boolean IsInterleaving(String a, String b, String c) {
		if (a == null || a.length() == 0) return b.equals(c);
		if (b == null || b.length() == 0) return a.equals(c);

		if (a.charAt(0) != c.charAt(0) && b.charAt(0) != c.charAt(0))
			return false;
		else {
			if (b.charAt(0) != c.charAt(0)) // checking != is important because == will even consider the case of repeating characters in a and b
				return IsInterleaving(a.substring(1), b, c.substring(1));
			else if (a.charAt(0) != c.charAt(0))
				return IsInterleaving(a, b.substring(1), c.substring(1));
			else // this case insures the repeatition of characters in a and b if any 
				return (IsInterleaving(a, b.substring(1), c.substring(1)) || IsInterleaving(a.substring(1), b, c.substring(1)));
		}

	}

}

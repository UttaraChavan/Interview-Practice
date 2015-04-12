
public class PrintReverseString {

	public static void main(String args[]){
		String s = "GeeksForGeeks";
		//PrintReverse(s);
		String result = PrintReverse(s, "");
		System.out.println(result);
	}

	/*private static void PrintReverse(String s) {
		if (s.length() <=  0)
			return;
		PrintReverse(s.substring(1));
		System.out.print(s.charAt(0));
	}*/
	
	private static String PrintReverse(String s, String res) {
		if (s.length() <= 0)
			return "";
		return PrintReverse(s.substring(1), res) + s.charAt(0);
	}
}

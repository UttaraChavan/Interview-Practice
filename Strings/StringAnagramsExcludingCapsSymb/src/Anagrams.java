import java.util.Scanner;

public class Anagrams {
	static String input;
	public static void main(String args[]){
		Scanner kbd = new Scanner (System.in);
		input = kbd.nextLine();
		
		for (int i=0; i<input.length()-1; i++){
			if (!acceptableChar(input.charAt(i)))
				continue;
			for (int j=i+1; j<input.length(); j++){
				if (!acceptableChar(input.charAt(j)))
					continue;
				SwapChars(i, j);
			}
		}
	}

	private static void SwapChars(int i, int j) {
		// TODO Auto-generated method stub
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(input.substring(0, i));
		sbuf.append(input.substring(j,j+1));
		sbuf.append(input.substring(i+1,j));
		sbuf.append(input.substring(i,i+1));
		sbuf.append(input.substring(j+1,input.length()));
		System.out.println(sbuf);
	}

	private static boolean acceptableChar(char c) {
		// TODO Auto-generated method stub
		
		switch (c) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				return true;
			
		}
		return false;
	}
}

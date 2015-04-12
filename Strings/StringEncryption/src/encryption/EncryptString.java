package encryption;

import java.util.Scanner;

public class EncryptString {
	public static void main(String args[]){
		Scanner kbd = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		s.append(kbd.nextLine().toUpperCase());
		
		for (int i=0; i<s.length(); i++){
			int tmp = ((s.charAt(i)-'A'+1)*4)%26;
			System.out.print(tmp + " ");
		}
	}
}

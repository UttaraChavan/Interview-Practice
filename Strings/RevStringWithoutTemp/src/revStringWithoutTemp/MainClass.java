package revStringWithoutTemp;

import java.util.Scanner;

public class MainClass {
	public static void main(String Args[]){
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		
		for(int i=0; i<input.length()-1; i++){
			input = input.substring(1, input.length()-i) + input.charAt(0) + input.substring(input.length()-i, input.length());
			System.out.println(input);
		}
	}
}

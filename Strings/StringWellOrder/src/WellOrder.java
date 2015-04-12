import java.util.Scanner;

public class WellOrder {
	public static void main(String args[]){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter number of characters: ");
		int nochar = kbd.nextInt();

		GenerateWellOrderedSeq("", nochar);
	}

	private static void GenerateWellOrderedSeq(String input, int charLeft) {
		// TODO Auto-generated method stub
		if (charLeft ==0){
			System.out.println(input);
		}

		char i;
		if (input.isEmpty())
			i = 'a';
		else 
			i = (char) (input.charAt(input.length()-1)+1);	
		
		for (; i<'z'; i++){
			GenerateWellOrderedSeq(input+i, charLeft-1);
		}
	}
}

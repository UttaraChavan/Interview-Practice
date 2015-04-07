import java.util.Scanner;
import java.util.Stack;

/*What I learned:
Stack needs Character an object type. While push or poop compare we need to create new Character 
What I learned*/

public class StringBalance {
	public static void main(String args[]){
		Scanner kbd = new Scanner(System.in);

		System.out.print("Enter String: ");
		String input = kbd.nextLine();
		Stack<Character> stk = new Stack<>();
		for (int i=0; i<input.length(); i++){
			switch (input.charAt(i)){
				case '{':
				case '[':
				case '(':
					System.out.println("Pushed");
					stk.push(input.charAt(i));
					break;
				case '}':
					if (stk.isEmpty() || !stk.pop().equals(new Character('{'))){
						System.out.println("{ String is unbalanced");
						i = input.length();
					}
					break;
				case ']':
					if (stk.isEmpty() || !stk.pop().equals(new Character('['))){
						System.out.println("[ String is unbalanced");
						i = input.length();
					}
					break;
				case ')':
					if (stk.isEmpty() || !stk.pop().equals(new Character('('))){
						System.out.println("( String is unbalanced");
						i = input.length();
					}
					break;					
				default:
					System.out.println(input.charAt(i));
					break;
			}

		}
	}
}


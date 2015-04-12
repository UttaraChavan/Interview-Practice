import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String args[]){
		String s = "GeeksQuiz";
		HashMap<Character, Integer> HMap = new HashMap<Character, Integer>();
		
		for (int i=0; i<s.length(); i++){
				HMap.put(s.charAt(i), i);
		}
		
		int minIndex = Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> entry : HMap.entrySet()){
			if (entry.getValue() < minIndex)
				minIndex = entry.getValue();
		}
		
		System.out.println("First no-repeating character: " + s.charAt(minIndex));
	}
}

import java.util.HashMap;
import java.util.Map;

public class CheckIfAnagrams {

	public static void main(String args[]){
		String s1 = "abcd";
		String s2 = "dabe";
		HashMap<Character, Integer> HMap = new HashMap<Character, Integer>();
		boolean notAnagram = false;

		if (s1.length() != s2.length())
			notAnagram = true;			
		else {
			for (char c : s1.toCharArray()){
				if (HMap.containsKey(c))
					HMap.put(c, HMap.get(c)+1);
				else 
					HMap.put(c, 1);
			}

			for (char c : s2.toCharArray()){
				if (HMap.containsKey(c)){
					int val = HMap.get(c);
					if (val == 0){
						notAnagram = true;
						break;
					} else { 
						HMap.put(c, val-1);
					}
				} else {
					notAnagram = true;
					break;
				}					
			}

			if (!notAnagram)
				for (Map.Entry<Character, Integer> me : HMap.entrySet()){
					if (me.getValue() != 0){
						notAnagram = true;
						break;
					}
				}			
		}
		if (notAnagram)
			System.out.println("Not an Anagram");
		else
			System.out.println("Anagram");
	}
}

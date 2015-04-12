import java.util.HashMap;

public class LongestSubStrLen {

	public static void main(String args[]){
		String str = "geeksforgeeks";
		int curr_len = 1, max_len = 1;
		Integer prev_index;
		HashMap<Character, Integer> HMap = new HashMap<Character, Integer>();
		
		HMap.put(str.charAt(0), 0);
		
		for (int i=1; i<str.length(); i++){
			prev_index = HMap.get(str.charAt(i));
			
			if (prev_index == null || i-curr_len > prev_index){
				curr_len++;
			} else {
				if (curr_len > max_len)
					max_len = curr_len;
				curr_len = i-prev_index;
			}
			
			HMap.put(str.charAt(i), i);
		}
		
		if (curr_len > max_len)
			max_len = curr_len;
		
		System.out.println(max_len);
	}
}

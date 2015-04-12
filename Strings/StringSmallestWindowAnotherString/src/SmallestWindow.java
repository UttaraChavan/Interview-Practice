import java.util.ArrayList;
import java.util.HashMap;

public class SmallestWindow {

	public static void main(String args[]){
		//String str1 = "this is a test string", str2 = "tist";
		String str1 = "geeksforgeeksgef", str2 = "gf";

		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		for (int i=0; i<str2.length(); i++){
			if (HM.containsKey(str2.charAt(i))){
				HM.put(str2.charAt(i), HM.get(str2.charAt(i))+1);
			} else {
				HM.put(str2.charAt(i), 1);
			}
		}

		int len_chkStr = str2.length();
		int minLength=Integer.MAX_VALUE;
		ArrayList<Integer> diff = new ArrayList<Integer>();
		int count=0;
		StringBuffer sbuf = new StringBuffer();

		for (int i=0; i<str1.length(); i++){
			if (HM.get(str1.charAt(i)) != null){	
				diff.add(count);
				if (len_chkStr != 0){
					len_chkStr--;
				} else {
					sbuf.deleteCharAt(0);
					int k;
					for (k=0; k<sbuf.length(); k++){
						if (HM.containsKey(sbuf.charAt(k)))
							break;
					}
					sbuf.delete(0, k);
					sbuf.delete(0, count);
					if (sbuf.length() < minLength)
						minLength = sbuf.length()+1;
				}
				count = 0;
			} else {
				count++;
			}
			sbuf.append(str1.charAt(i));
		}
		
		System.out.println(sbuf.toString());
		System.out.println(minLength);
	}
}

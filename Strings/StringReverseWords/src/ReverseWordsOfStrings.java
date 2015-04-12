
public class ReverseWordsOfStrings {

	public static void main(String args[]){
		String s = "I like this program very much";
		StringBuffer result = new StringBuffer();

		String arr[]  = s.split(" ");
		result.append(new StringBuffer(arr[0]).reverse().toString());
		for (int i=1; i<arr.length; i++){
			result.append(" ");
			result.append(new StringBuffer(arr[i]).reverse().toString());			
		}
		System.out.println(result.reverse().toString());
	}
}

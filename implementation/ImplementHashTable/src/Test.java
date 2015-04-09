
public class Test {

	public static void main(String args[]){
		HashTable ht = new HashTable(10);
	
		ht.put("Uttara", "Intelligent");
		String value = ht.get("Uttara");
		
		System.out.println(value);
	}
}

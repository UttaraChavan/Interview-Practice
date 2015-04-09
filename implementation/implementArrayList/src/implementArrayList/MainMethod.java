package implementArrayList;

public class MainMethod {

	public static void main(String args[]){
		MyList<String> arr = new MyList<String>();
		
		arr.add("Uttara");
		arr.add("Chavan");
		arr.add("Kasturi");
		arr.add("Chavan");
		
		System.out.println("Size is: " +  arr.size());
		for (int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		
		System.out.println("\nElement to be removed: " + arr.remove(0));
	}
}

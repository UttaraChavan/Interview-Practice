
public class Getintersection {

	public static void main(String args[]){
		
		ListNode z = new ListNode("Z");
		ListNode e = new ListNode("E");
		ListNode f = new ListNode("F");
		LinkedList ll_1 = new LinkedList();		
		ll_1.add("A"); ll_1.add("B"); ll_1.add("C"); ll_1.add("D"); ll_1.add(z); ll_1.add(e); ll_1.add(f);
		
		LinkedList ll_2 = new LinkedList();
		ll_2.add("P"); ll_2.add("Q"); ll_2.add(z); ll_2.add(e); ll_2.add(f);
		
		int size1 = ll_1.size, size2 = ll_2.size;
		int diff;
		ListNode currLarge, currSmall;
		if (size1 > size2){
			diff = size1-size2;
			currLarge = ll_1.root;
			currSmall = ll_2.root;
		} else {
			diff = size2-size1;
			currLarge = ll_2.root;
			currSmall = ll_1.root;
		}
		
		for (int i=0; i<diff; i++)
			currLarge = currLarge.next;
		
		while (currLarge != currSmall){
			currLarge = currLarge.next;
			currSmall = currSmall.next;
		}	
		
		if (currSmall == null)
			System.out.println("Two lists don't intersect");
		else 
			System.out.println(currSmall);
	}
}

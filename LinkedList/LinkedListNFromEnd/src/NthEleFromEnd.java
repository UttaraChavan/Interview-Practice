import java.util.Scanner;

public class NthEleFromEnd {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("C"); ll.add("B"); ll.add("A"); ll.add("A"); ll.add("D"); ll.add("E"); ll.add("F"); ll.add("G");
		System.out.println("Enter number of element ");
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		
		ListNode node = getNth(n, ll);
		if (node == null)
			System.out.println("Less elements are present in the LinkedList");
		else
			System.out.println(node);
		
	}

	private static ListNode getNth(int n, LinkedList ll) {
		ListNode lead = ll.root;
		ListNode lag = ll.root;
		int i=0;
		while (lead.next != null){
			lead = lead.next;
			i++;
			if (i >= n)
				lag = lag.next;
		}
		
		if (i < n)
			return null;
		else 
			return lag;
	}
	
}


public class PairSwap {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("C"); ll.add("B"); ll.add("A"); ll.add("Z"); ll.add("D"); ll.add("E"); ll.add("F"); ll.add("G");

		ListNode curr = ll.root;
		if (curr.next!=null) ll.root=curr.next;
		else ll.root=curr;
		
		ll.root = curr.next;
		ListNode prev = null;
		while (curr != null)
			if (curr.next != null){
				if (prev != null)
					prev.next = curr.next;
				ListNode n = curr.next.next;
				curr.next.next = curr;
				curr.next = n;
				prev = curr;
				curr = curr.next;
				
			} else break;

		System.out.println(ll);
	}
}

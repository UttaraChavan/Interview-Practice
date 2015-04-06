
public class Split {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("C"); ll.add("B"); ll.add("A"); ll.add("Z"); ll.add("D"); ll.add("E"); ll.add("F"); ll.add("G");
		System.out.println(ll);

		ListNode firstEnd = GetMidOfLinkedList(ll);
		ListNode secStart = firstEnd.next;
		System.out.println(firstEnd);
		System.out.println(secStart);
		
		ListNode curr;
		LinkedList ll_1 = new LinkedList();	
		curr = ll.root;
		while (curr != secStart){
			ll_1.add(curr.str);
			curr = curr.next;
		}

		LinkedList ll_2 = new LinkedList();	
		curr = secStart;
		while (curr != ll.root){
			ll_2.add(curr.str);
			curr = curr.next;
		}
		
		System.out.println("Output Lists: ");
		System.out.println(ll_1);
		System.out.println(ll_2);
	}

	private static ListNode GetMidOfLinkedList(LinkedList ll) {
		ListNode slow = ll.root, fast = ll.root.next;

		while (true){
			if (fast == ll.root)
				return slow;
			else fast = fast.next;
			if (fast == ll.root)
				return slow;
			else {
				fast = fast.next;
				slow = slow.next;
			}	
		}
	}
}

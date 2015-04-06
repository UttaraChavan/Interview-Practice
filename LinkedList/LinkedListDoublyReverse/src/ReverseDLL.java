
public class ReverseDLL {

	public static void main(String args[]){
		D_LinkedList ll = new D_LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("D"); ll.add("E"); ll.add("F");
		System.out.println(ll);
		
		ll.root = Reverse_DLL(ll);
		System.out.println(ll);
	}

	private static ListNode Reverse_DLL(D_LinkedList ll) {
		ListNode curr = ll.root, prev = null, next = null;
		
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			if (prev != null)
				prev.prev = curr;
			prev = curr;
			curr.prev = next;
			curr = next;
		}
		return prev;
	}
}

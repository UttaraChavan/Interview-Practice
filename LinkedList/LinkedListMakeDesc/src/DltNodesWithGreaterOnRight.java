
public class DltNodesWithGreaterOnRight {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();			
		//ll.add(12); ll.add(15); ll.add(10); ll.add(11); ll.add(5); ll.add(6); ll.add(2); ll.add(3);
		//ll.add(10); ll.add(20); ll.add(30); ll.add(40); ll.add(50); ll.add(60);
		ll.add(60); ll.add(50); ll.add(40); ll.add(30); ll.add(20); ll.add(10);
		ll.root = ReverseList(ll.root);
		
		ListNode curr = ll.root;
		while (curr.next != null){
			while (curr.num < curr.next.num){
				curr = curr.next;
				if (curr.next == null)
					break;
			}
			if (curr.next != null)
				curr.next = curr.next.next;
			else
				break;
		}
	
		ll.root = ReverseList(ll.root);
		System.out.println(ll);
	}

	private static ListNode ReverseList(ListNode root) {
		ListNode prev = null;
		ListNode curr = root;
		ListNode next = null;
		
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}

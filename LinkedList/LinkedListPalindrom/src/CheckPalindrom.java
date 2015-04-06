
public class CheckPalindrom {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("C"); ll.add("B"); ll.add("A");
		System.out.println(ll);
		
		ListNode head1 = ll.root;
		ListNode prev = GetMidOfLinkedList(ll);
		ListNode start = prev.next;
		ListNode head2 = ReverseList( start);
		start = head2;
		
		System.out.println(head1);
		System.out.println(head2);
		
		while (head1 != null && head2 != null && head1.str.equals(head2.str)){
			head1 = head1.next;
			head2 = head2.next;
		}
		
		if (head1 == null && head2 == null || head1 == null && head2.next == null || head2 == null && head1.next == null)
			System.out.println("It is a Palindrom!!!");
		else System.out.println("Not a Palindrom");
		
		ListNode connect = ReverseList(start);
		prev.next = connect;
		System.out.println(ll);
		
	}

	private static ListNode ReverseList(ListNode start) {
		ListNode prev = null;
		ListNode curr = start;
		ListNode next = null;
		
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}

	private static ListNode GetMidOfLinkedList(LinkedList ll) {
		ListNode slow = ll.root, fast = ll.root;
		
		while (true){
			if (fast.next == null)
				return slow;
			else fast = fast.next;
			if (fast.next == null)
				return slow;
			else {
				fast = fast.next;
				slow = slow.next;
			}	
		}
	}

	

	/*private static int GetMidOfLinkedList(LinkedList<String> ll) {
		This has running time of O(n^2), as it's a singly Linked List reverse iteration becomes a problem.
		 * Iterator<String> itrRev = ll.descendingIterator();
		Iterator<String> itr = ll.listIterator();
		int i=1, j=ll.size();
		while (i<=j){
			if (itr.next() != itrRev.next())
				break;
			else {
				i++;
				j--;
			}
		}
		
		if (j<i)
			return "It's a Palindrom!!!!";
		else return "Not a Palindrom";
		
		
	}*/
}

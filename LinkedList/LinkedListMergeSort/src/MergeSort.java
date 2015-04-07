
public class MergeSort {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();			
		//ll.add(12); ll.add(3); ll.add(20); ll.add(14); ll.add(13);
		ll.add(2); ll.add(3); ll.add(4); ll.add(3); ll.add(4); ll.add(5);

		ll.root = MergeSortList(ll.root);
		System.out.println(ll);
	}

	private static ListNode MergeSortList(ListNode root) {
		if (root == null || root.next == null)
			return root;
		
		ListNode mid = GetMidOfLinkedList(root);
		ListNode secRoot = mid.next;
		mid.next = null;
		ListNode h1 = MergeSortList(root);
		ListNode h2 = MergeSortList(secRoot);
		
		ListNode merged = merge (h1, h2, null);
		return merged;
	}

	private static ListNode merge(ListNode h1, ListNode h2, ListNode root) {
		ListNode connect;
		if (h1 == null)
			return h2;
		else if (h2 == null)
			return h1;
		else if (h1.num < h2.num){
			connect = h1;
			h1 = h1.next;
		} else {
			connect = h2;
			h2 = h2.next;
		}
		connect.next = merge(h1, h2, connect);
		return connect;
	}

	private static ListNode GetMidOfLinkedList(ListNode root) {
		ListNode slow = root, fast = root;

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
}

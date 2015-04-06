
public class MrgerSorted {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();			
		ll.add(5); ll.add(10); ll.add(15);
		LinkedList ll_1 = new LinkedList();	
		ll_1.add(2); ll_1.add(3); ll_1.add(20);
		LinkedList result = new LinkedList();

		ListNode list1 = ll.root, list2 = ll_1.root;
		result.root = merge(list1, list2, result.root);
		
		System.out.println(result);
		
	}

	private static ListNode merge(ListNode list1, ListNode list2, ListNode root) {
		ListNode connect;
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;
		else if (list1.num < list2.num){
			connect = list1;
			list1 = list1.next;
		} else {
			connect = list2;
			list2 = list2.next;
		}
		connect.next = merge(list1, list2, connect);
		return connect;
	}
}

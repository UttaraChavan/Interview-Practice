
public class Seggragate {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.add(2); ll.add(5); ll.add(6); ll.add(3); ll.add(12); ll.add(22); ll.add(15); ll.add(7); ll.add(52); 
		System.out.println(ll);
		
		ListNode prev = null, curr = ll.root;

		LinkedList ll_odd = new LinkedList();

		while (true){
			while (curr != null && curr.num%2 == 0){
				prev = curr;
				curr = curr.next;
			}
			if (curr != null) {				
				prev.next = curr.next;
				curr.next = null;
				ll_odd.add(curr);
				curr = prev.next;
			} else {
				prev.next = ll_odd.root;
				break;
			}
		}
		
		System.out.println(ll);
	}
}

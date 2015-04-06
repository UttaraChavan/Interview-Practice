
public class IdenticalLinekdList {
	public static void main(String args[]){
		LinkedList ll = new LinkedList();			
		ll.add(12); ll.add(15); ll.add(10); ll.add(11);
		LinkedList ll_1 = new LinkedList();	
		ll_1.add(12); ll_1.add(15); ll_1.add(10); ll_1.add(11);
		
		ListNode first = ll.root, second = ll_1.root;
		while (first != null && second != null && first.num == second.num){
			first = first.next;
			second = second.next;
		}
		
		if (first == null && second == null)
			System.out.println("Identical Lists");
		else 
			System.out.println("Lists are not identical");
	
	}
}

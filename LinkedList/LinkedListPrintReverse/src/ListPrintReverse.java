
public class ListPrintReverse {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("D"); ll.add("E"); ll.add("F");
		
		PrintLL(ll.root);
		
	}

	private static void PrintLL(ListNode root) {
		if (root == null)
			return;
		PrintLL(root.next);
		System.out.print(root + " ");
	}
}

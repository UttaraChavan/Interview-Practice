
public class Loop {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();	
		ListNode common = new ListNode ("Common");
		
		ll.add("A"); ll.add("B"); ll.add("C"); ll.add("C"); ll.add(common); ll.add("B"); ll.add("A"); ll.add("D"); ll.add("E"); ll.add(common);
		
		ListNode slow = null, fast = ll.root;
		while (slow != fast && fast != null){
			if (slow == null){
				slow = ll.root;
			}
			fast = fast.next;  
			if (slow == fast || fast == null){ 
				break;
			} 
			fast = fast.next;
			slow = slow.next;
		}
		
		if (fast == null)
			System.out.println("No loop exists");
		else 
			System.out.println("Loop exists " + slow);
	}	
}

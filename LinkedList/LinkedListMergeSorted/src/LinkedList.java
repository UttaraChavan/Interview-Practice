
public class LinkedList {

	public ListNode root, last;
	
	public LinkedList(){
		root = null;
		last = null;
	}
	
	public void add(int s){
		ListNode n = new ListNode(s);
		if (root == null){
			root = n;
			last = n;
		} else {
			last.next = n;
			last = last.next;
		}	
	}
	
	public void add(ListNode node){
		if (root == null){
			root = node;
			last = node;
		} else {
			last.next = node;
			last = last.next;
		}	
	}
	
	public void addFirst(ListNode node){
		node.next = root;
		root = node;
		if (root == null){
			last = node;
		}	
	}
	
	@Override
	public String toString(){
		ListNode curr = root;
		StringBuffer sbuf = new StringBuffer();
		while (curr != null){
			sbuf.append(curr);
			sbuf.append(" ");
			curr = curr.next;
		}		
		return sbuf.toString();
	}
	
}

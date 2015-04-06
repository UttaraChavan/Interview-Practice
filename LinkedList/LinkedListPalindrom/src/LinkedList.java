
public class LinkedList {

	public ListNode root, last;
	
	public LinkedList(){
		root = null;
		last = null;
	}
	
	public void add(String s){
		ListNode n = new ListNode(s);
		if (root == null){
			root = n;
			last = n;
		} else {
			last.next = n;
			last = last.next;
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

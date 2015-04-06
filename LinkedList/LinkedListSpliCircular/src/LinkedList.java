
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
		last.next = root;
	}
	
	@Override
	public String toString(){		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(root);
		sbuf.append(" ");
		ListNode curr = root.next;
		while (curr != root){
			sbuf.append(curr);
			sbuf.append(" ");
			curr = curr.next;
		}		
		return sbuf.toString();
	}
	
}

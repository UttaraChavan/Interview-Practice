
public class LinkedList {

	public ListNode root, last;
	
	public LinkedList(){
		root = null;
		last = null;
	}
	
	public void add(int s){
		ListNode n = new ListNode(s);
		n.left = last;
		if (root == null){
			root = n;
			last = n;
		} else {
			last.right = n;
			last = last.right;
		}
		last.right = root;
	}
	
	public void add(ListNode n){
		n.left = last;
		if (root == null){
			root = n;
			last = n;
		} else {
			last.right = n;
			last = last.right;
		}
		last.right = root;
	}
	
	@Override
	public String toString(){		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(root);
		sbuf.append(" ");
		ListNode curr = root.right;
		while (curr != root){
			sbuf.append(curr);
			sbuf.append(" ");
			curr = curr.right;
		}		
		return sbuf.toString();
	}
	
}

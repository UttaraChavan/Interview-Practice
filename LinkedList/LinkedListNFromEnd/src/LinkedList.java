
public class LinkedList {

	public ListNode root, last;
	int size;
	
	public LinkedList(){
		root = null;
		last = null;
		size = 0;
	}
	
	public void add(String s){
		ListNode n = new ListNode(s);
		if (size == 0){
			root = n;
			last = n;
		} else {
			last.next = n;
			last = last.next;
		}	
		size++;
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


public class ListNode {

	public  String str;
	public ListNode next, prev;
	
	public ListNode(String s){
		this.str = s;
		this.next = null;
		this.prev = null;
	}
	
	@Override
	public String toString() { 
		return this.str;
	}
	
}

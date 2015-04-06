
public class ListNode {

	public  String str;
	public ListNode next;
	
	public ListNode(String s){
		this.str = s;
		this.next = null;
	}
	
	@Override
	public String toString() { 
		return this.str;
	}
	
}

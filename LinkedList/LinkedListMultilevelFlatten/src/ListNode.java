
public class ListNode {

	public int num;
	public ListNode next, child;
	
	public ListNode(int n){
		this.num = n;
		this.next = null;
		this.child = null;
	}
	
	@Override
	public String toString() { 
		return String.valueOf(this.num);
	}
	
}

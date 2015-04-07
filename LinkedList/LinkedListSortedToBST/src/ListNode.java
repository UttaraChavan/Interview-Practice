
public class ListNode {

	public int num;
	public ListNode next;
	
	public ListNode(int n){
		this.num = n;
		this.next = null;
	}
	
	@Override
	public String toString() { 
		return String.valueOf(this.num);
	}
	
}

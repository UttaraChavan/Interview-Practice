
public class ListNode {

	public int num;
	public ListNode left, right;
	
	public ListNode(int n){
		this.num = n;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() { 
		return String.valueOf(this.num);
	}
}

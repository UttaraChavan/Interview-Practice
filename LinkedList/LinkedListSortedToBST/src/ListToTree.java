
public class ListToTree {

	static ListNode h;

	public TreeNode SortedListToBST(ListNode head) {
		h = head;
		int len = GetLen(head);
		return SortedListToBSTHelper(0, len-1);
	}

	private TreeNode SortedListToBSTHelper(int start, int end) {
		if (start > end)
			return null;
		
		int mid = (end + start)/2;
		TreeNode left = SortedListToBSTHelper(start, mid-1);
		TreeNode root = new TreeNode(h.num);
		root.left = left;
		
		h = h.next;
		root.right = SortedListToBSTHelper(mid+1, end);
		
		return root;
	}

	private int GetLen(ListNode head) {
		ListNode curr = head;
		int i=0;
		while (curr != null){
			i++;
			curr = curr.next;
		}
		return i;
	}
	
	public void DisplayTree(TreeNode t) {
		if (t == null)
			return;
		System.out.print(t+" ");
		DisplayTree(t.left);
		DisplayTree(t.right);		
	}
}


public class Convert {

	public static void main(String args[]){
		
		Tree t = new Tree();
		t.insert(4); t.insert(2); t.insert(5); t.insert(1); t.insert(3);
		System.out.println("Preorder tree traversal: ");
		t.traverse();
		
		ListNode start = ConvertTreeToDCLL(t.root);
		
		System.out.println("\nCircular Doubly Linked List: ");
		System.out.print(start + " ");
		ListNode curr = start.right;
		while (curr != start){
			System.out.print(curr + " ");
			curr = curr.right;
		}
	}

	private static ListNode ConvertTreeToDCLL(ListNode root) {
		if (root == null){
			return null;
		}
		ListNode leftTree = ConvertTreeToDCLL(root.left);
		ListNode rightTree = ConvertTreeToDCLL(root.right);
		ListNode head;
		
		if (leftTree == null){
			head = root;
		} else {
			head = leftTree;
			leftTree.left.right = root;
			root.left = leftTree.left;
		}
		
		if (rightTree == null){
			head.left = root;
			root.right = head;
		} else {
			head.left = rightTree.left;
			rightTree.left.right = head; 
			root.right = rightTree;
			rightTree.left = root;
		}
			
		return head;
	}	
	
}

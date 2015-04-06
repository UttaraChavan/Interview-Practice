
public class Tree {

	public ListNode root;
	
	public void insert(int key){
		ListNode newNode = new ListNode(key);
		
		if (root == null){
			root = newNode;
		} else{
			ListNode current = root;
			ListNode parent;
			while (true){
				parent = current;
				if (key < current.num){
					current = current.left;
					if (current == null){
						parent.left = newNode;
						return;
					}

				} else {
					current = current.right;
					if (current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	public void traverse(){  
		traverseHelper(root);
	}
	
	public void traverseHelper(ListNode n){
		if (n == null) return;
		System.out.print(n + " ");
		traverseHelper(n.left);
		traverseHelper(n.right);
	}
}

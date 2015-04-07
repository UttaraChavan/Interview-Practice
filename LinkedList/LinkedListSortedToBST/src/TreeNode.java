
public class TreeNode {
	public int num;
	public TreeNode left, right;
	
	public TreeNode(int n){
		this.num = n;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() { 
		return String.valueOf(this.num);
	}
}

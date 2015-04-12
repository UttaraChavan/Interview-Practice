
public class TreeApp {

	public static void main(String[] args){
		Tree treeObj = new Tree();

		treeObj.insert(50, 1.5);
		treeObj.insert(25, 1.7);
		treeObj.insert(75, 1.9);

		treeObj.traverse();

		Node found = treeObj.find(25);
		if (found != null)
			System.out.println("Found node with key 25");
		else
			System.out.println("Node with key 25 does not exist");	
	}
}

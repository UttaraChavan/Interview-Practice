import java.util.ArrayList;
import java.util.Queue;

public class FlattenMultiLevelList {

	public static void main(String args[]){
		ListNode l1 = new ListNode(10); ListNode l2 = new ListNode(5); ListNode l3 = new ListNode(12);
		ListNode l4 = new ListNode(7); ListNode l5 = new ListNode(11); ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(20); ListNode l8 = new ListNode(13); ListNode l9 = new ListNode(17); 
		ListNode l10 = new ListNode(6); ListNode l11 = new ListNode(2); ListNode l12 = new ListNode(16);
		ListNode l13 = new ListNode(9); ListNode l14 = new ListNode(8); ListNode l15 = new ListNode(3);
		ListNode l16 = new ListNode(19); ListNode l17 = new ListNode(15);

		l1.next = l2; l1.child = l6;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5; l4.child = l9;
		l6.next = l7;
		l7.next = l8; l7.child = l11;
		l8.child = l12;
		l9.next = l10; l9.child = l13;
		l12.child = l15;
		l13.next = l14; l13.child = l16;
		l16.next = l17;

		ArrayList<ListNode> result = new ArrayList<ListNode>();
		ArrayList<ListNode> helper = new ArrayList<ListNode>();

		ListNode curr = l1;
		while (true){
			while (curr.next != null){
				
				result.add(curr);
				if (curr.child != null){
					helper.add(curr);
				}
				curr = curr.next;
			}
			
			if (!helper.isEmpty()){
				curr.next = helper.remove(0).child;
			} else {
				result.add(curr);
				break;
			}
		}
		
		for (ListNode n : result){
			System.out.print(n + " ");
		}
	}
}

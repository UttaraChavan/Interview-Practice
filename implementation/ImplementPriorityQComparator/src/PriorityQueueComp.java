import java.util.PriorityQueue;

public class PriorityQueueComp {
	
	public static void main(String[] args){
		PriorityQueueComparator pqc = new PriorityQueueComparator();
		PriorityQueue pq = new PriorityQueue(pqc);
				
		String arg1 = "BC";
		Object o1 = arg1;
		pq.add(o1);		
		
		String arg2 = "ABC";
		Object o2 = arg2;
		pq.add(o2);
		
		String arg3 = "ACFD";
		Object o3 = arg3;
		pq.add(o3);
		
		for (Object s : pq){
			System.out.println(String.valueOf(s));
		}
		
	}
}

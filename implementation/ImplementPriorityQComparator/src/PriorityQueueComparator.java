import java.util.Comparator;


public class PriorityQueueComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (String.valueOf(o1).length() < String.valueOf(o2).length()) {
			System.out.println(o1.toString() + " "+ o2.toString());
			return -1;
		}
		if (String.valueOf(o1).length() > String.valueOf(o2).length()) {
			System.out.println(o1.toString() + " "+ o2.toString());
			return 1;
		}
		return 0;
	}


}


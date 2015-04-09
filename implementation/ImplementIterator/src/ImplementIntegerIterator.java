import java.util.Iterator;

public class ImplementIntegerIterator {

	public static void main(String args[]){
		Range rng = new Range(2, 8);
		
		Iterator<Integer> it = rng.iterator();
		while (it.hasNext()){
			System.out.print( it.next() + " ");
		}
	}
}

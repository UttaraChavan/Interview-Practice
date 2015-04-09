import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>{

	public final int rangeStart, rangeEnd;

	public Range(int s, int e){
		rangeStart = s;
		rangeEnd = e;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new RangeIterator(rangeStart, rangeEnd);
	}

	private class RangeIterator implements Iterator<Integer>{
		private int cursor;
		private final int end;

		public RangeIterator(int s, int e){
			cursor = s;
			end = e;
		}

		@Override 
		public boolean hasNext() {
			return cursor <= end;
		}

		@Override
		public Integer next() {	
			if (!hasNext())
				throw new NoSuchElementException();

			return cursor++;		
		}
	}
}

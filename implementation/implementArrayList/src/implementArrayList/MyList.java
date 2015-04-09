package implementArrayList;

import java.util.Arrays;

public class MyList<E> {
	private Object[] internalArray;
	private int actualSize;
	
	public MyList(){
		actualSize = 0;
		internalArray = new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		if (index >= actualSize || index < 0)
			throw new IndexOutOfBoundsException();
		
		return (E) internalArray[index];
			
	}

	public void add(E e){
		if (internalArray.length - actualSize < 2)
			ResizeArray();

		internalArray[actualSize++] = e;
	}

	@SuppressWarnings("unchecked")
	public E remove(int index){
		if (index > actualSize)
			throw new IndexOutOfBoundsException();
		else {
			E tmp = (E) internalArray[index];
			int i = index;
			while (i < actualSize-1){
				internalArray[i] = internalArray[i+1];
				i++;
			}
			actualSize--;
			return tmp;
		}			
	}

	public int size(){
		return actualSize;
	}
	
	private void ResizeArray() {
		internalArray = Arrays.copyOf(internalArray, internalArray.length*2);
	}

}

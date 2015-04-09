
public class HashTable {
	
	private Item[] data;
	private int capacity, size;
	private static final Item AVAILABLE = new Item("Available", "Inital Value");
	
	public HashTable(int Cap){
		this.capacity = Cap;
		this.data = new Item[this.capacity];
		size = 0;
		for (int i = 0; i<this.capacity; i++){
			this.data[i] = AVAILABLE;
		}
	}
	
	public int size(){
		return this.size;
	}
	
	public int HashThis(String key){
		int hash = key.hashCode()<0?-key.hashCode()%this.capacity:key.hashCode()%this.capacity;
		return hash;
		
	}
	
	public String get(String key){
		int hash = HashThis(key);
		
		while (data[hash] != AVAILABLE && data[hash].Key() != key){
			hash = (hash+1)%capacity;
		}
		
		return data[hash].element();
	}
	
	public void put(String k, String val){
		int hash = HashThis(k);
		
		while (data[hash] != AVAILABLE && data[hash].Key() != k){
			hash = (hash+1)%capacity;
		}
	
		data[hash] = new Item(k, val);
		size++;
	}
	
	public String toString(){
		StringBuffer s = new StringBuffer();
		s.append("<HashTable [");
		
		for (int i=0; i<this.capacity; i++){
			if (data[i] != AVAILABLE){
				s.append("(");
				s.append(data[i].toString());
				s.append(")");
			}				
		}
		s.append("]>");
		
		return s.toString();
	}
	
}

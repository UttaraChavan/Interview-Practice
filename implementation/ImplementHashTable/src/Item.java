
public class Item {

	private String key;
	private String elemnet;
	
	public Item(String k, String o){
		this.key = k;
		this.elemnet = o;
	}
	
	public String Key(){
		return key;
	}
	
	public String element(){
		return elemnet;
	}
	
	public void setKey(String s){
		this.key = s;
	}
	
	public void setElement(String ob){
		this.elemnet = ob;
	}
	
	public String toString(){
		StringBuffer s = new StringBuffer();
		s.append("<Item (");
		s.append(this.Key());
		s.append(this.element());
		s.append(")>");
		
		return s.toString();
	}
	
}

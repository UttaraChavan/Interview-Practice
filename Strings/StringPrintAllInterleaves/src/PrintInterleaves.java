import java.awt.List;
import java.util.ArrayList;


public class PrintInterleaves {
	public static void main(String[] args){
		
		ArrayList<String> l = interleave("ab", "1234"); //interleave("a", "b"); interleave("ab", "cd");
		for (String s : l){
			System.out.print(s + " ");
		}
		
	}

	public static ArrayList<String> interleave(String first, String second){
	    if(first.length() == 0){
	    	ArrayList<String> list = new ArrayList<String>();
	        list.add(second);
	        return list;
	    }
	    else if(second.length() == 0){
	    	ArrayList<String> list = new ArrayList<String>();
	        list.add(first);
	        return list;
	    }
	    else{
	        char c1 = first.charAt(0);
	        ArrayList<String> listA =  multiply(c1,interleave(first.substring(1),second));
	        char c2 = second.charAt(0);
	        ArrayList<String> listB =  multiply(c2,interleave(first,second.substring(1)));
	        listA.addAll(listB);
	        return listA;
	    }
	}

	public static ArrayList<String> multiply(char c, ArrayList<String> list){
		ArrayList<String> result = new ArrayList<String>();
        for(String str : list){
            String res = Character.toString(c) + str;
            result.add(res);
        }
    return result;
}
}

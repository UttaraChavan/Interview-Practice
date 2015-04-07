
public class WordInMat {
	static char arr[][] = {
		{'a', 'b', 'c', 'd'},
		{'e', 'f', 'g', 'h'},
		{'i', 'j', 'k', 'l'},
		{'m', 'n', 'o', 'p'}			
	};

	public static void main(String args[]){

		String[] wrds = {"nop", "nope", "dgj", "dgk"};
		for (String w: wrds){
			System.out.println(w+" "+presentInMat(w));
		}
	}

	private static boolean presentInMat(String w) {
		// TODO Auto-generated method stub
		int wrdLen = w.length();

		for (int col=0; col<arr[0].length; col++){
			for (int row=0; row<arr.length; row++){
				if (arr[row][col] == w.charAt(0)){
					if (row<=arr.length-wrdLen && col<=arr.length-wrdLen){
						if (checkHor(w, row, col) || checkVer(w, row, col) || checkDia1(w, row, col)){
							return true;
						}					
					} else if(row<=arr.length-wrdLen){
						if (row==arr.length-1-col){
							return (checkVer(w, row, col) || checkDia2(w, row, col));
						}
						return checkVer(w, row, col);
					} else if(col<=arr.length-wrdLen){
						return checkHor(w, row, col);
					} else if (row == arr.length-wrdLen && col == arr.length-wrdLen ){
						return checkDia1(w, row, col);
					} else if (row == wrdLen && col == wrdLen){
						return checkDia2(w, row, col);
					}
				}
			}
		}
		return false;
	}

	private static boolean checkDia2(String w, int r, int c) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<w.length(); i++){
			if (w.charAt(i) != arr[r+i][c-i]){
				break;
			}
		}
		if (i==w.length())
			return true;
		else return false;		
	}

	private static boolean checkDia1(String w, int r, int c) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<w.length(); i++){
			if (w.charAt(i) != arr[r+i][c+i]){
				break;
			}
		}
		if (i==w.length())
			return true;
		else return false;
	}

	private static boolean checkVer(String w, int r, int c) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<w.length(); i++){
			if (w.charAt(i) != arr[r+i][c]){
				break;
			}
		}
		if (i==w.length())
			return true;
		else return false;
	}

	private static boolean checkHor(String w, int r, int c) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<w.length(); i++){
			if (w.charAt(i) != arr[r][c+i]){
				break;
			}
		}
		if (i==w.length())
			return true;
		else return false;
	}
}


public class LongestComonSubsequence {

	public static void main(String args[]){
		String s1 = "spanking";
		String s2 = "amputation";
		/*String s1 = "ABCDGH";
		String s2 = "AEDFHR";*/
		/*String s1 = "AGGTAB";
		String s2 = "GXTXAYB";*/
		
		findLCS(s1, s2);
	}

	private static void findLCS(String s1, String s2) {
		int m = s1.length(), n = s2.length();
		int b[][] = new int[m][n], c[][] = new int[m+1][n+1];

		for (int i=1; i<= m; i++)
			c[i][0] = 0;
		for (int i=0; i<= n; i++)
			c[0][i] = 0;

		for (int i=1; i<=m; i++)
			for(int j=1; j<=n; j++){
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					c[i][j] = c[i-1][j-1] + 1;
					b[i-1][j-1] = 1;
				} else if (c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i-1][j-1] = 2;
				} else {
					c[i][j] = c[i][j-1];
					b[i-1][j-1] = 3;
				}
			}
		
		
		PrintLCS(b, s2, m-1, n-1);
	}

	private static void PrintLCS(int[][] b, String s2, int m, int n) {
		if (m==-1 || n==-1)
			return;
		if (b[m][n] == 1) {
			PrintLCS(b, s2, m-1, n-1);
			System.out.print(s2.charAt(n));
		} else if (b[m][n] == 2)
			PrintLCS(b, s2, m-1, n);
		else
			PrintLCS(b, s2, m, n-1);
		
	}
}

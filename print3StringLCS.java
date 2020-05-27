package dynamicPrograming;
import java.util.*;
public class print3StringLCS {
	static String lcs(String S1, String S2, int m, int n) {
	    int[][] LCS_table = new int[m + 1][n + 1];

	    for (int i = 0; i <= m; i++) {
	      for (int j = 0; j <= n; j++) {
	        if (i == 0 || j == 0)
	          LCS_table[i][j] = 0;
	        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
	          LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
	        else
	          LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
	      }
	    }

	    int index = LCS_table[m][n];
	    int temp = index;

	//    char[] lcs = new char[index + 1];
	  //  lcs[index] = '\0';
String lcs="";
	    int i = m, j = n;
	    while (i > 0 && j > 0) {
	      if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
	        lcs=lcs+S1.charAt(i - 1);

	        i--;
	        j--;
	        index--;
	      }

	      else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
	        i--;
	      else
	        j--;
	    }
	  return lcs;
	    //System.out.println(lcs); 

//	   System.out.print("S1 : " + S1 + "\nS2 : " + S2 + "\nLCS: ");
//	    for (int k = 0; k <= temp; k++)
//	      System.out.print(lcs[k]);
//	    System.out.println("");
	  }
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
	    String str3=sc.nextLine();
	    System.out.println(LCSwith3String(str1,str2,str3));
	}
	private static long LCSwith3String(String str1, String str2, String str3) {
		String s1=lcs(str1,str2,str1.length(),str2.length());
		String s2=lcs(str2,str3,str2.length(),str3.length());
		return lcs(s1,s2,s1.length(),s2.length()).length();
	}

}

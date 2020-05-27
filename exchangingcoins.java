package dynamicPrograming;
import java.util.*;
public class exchangingcoins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 long arr[]=new long[10000000];
		for(int i=0;i<10000000;i++) {
			arr[i]=-1;
		}
		int n=sc.nextInt();
		System.out.println(coins(n,arr));

	}

	private static long coins(int n, long[] dp) {
		if(n<=1000000 && dp[n] != -1)
			return dp[n];
		//base  case
		if(n <= 11){
			dp[n] = n;
			return dp[n];
		}
		long ans = Math.max(n,coins(n/2,dp)+coins(n/3,dp)+coins(n/4,dp));
		if(n <= 1000000)
			dp[n] = ans;//memoize the answer
		return ans;
	}

}

package dynamicPrograming;

import java.util.Scanner;

public class mixtureProblem {
static long arr[]=new long[100];
static long dp[][]=new long[100][100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.println(mixture(0,n-1));
	}
	private static long mixture(int i, int j) {
		if(i>=j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		dp[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++) {
			dp[i][j]=Math.min(dp[i][j], mixture(i,k)+mixture(k+1,j)+sum(i,k)*sum(k+1,j));
		}
		return dp[i][j];
	}
	private static long sum(int i, int j) {
		// TODO Auto-generated method stub
		long ans=0;
		for(int a=i;a<=j;a++) {
			ans+=arr[a];
			ans=ans%100;
		}
		return ans;
	}

}

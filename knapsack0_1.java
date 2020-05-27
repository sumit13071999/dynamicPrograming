package dynamicPrograming;
import java.util.*;
public class knapsack0_1 {
 public static int knapsack(int wts[],int prices[],int n,int w) {
	 if(n==0 || w==0) {
		 return 0;
	 }
	 int inc=0,exc=0;
	 if(wts[n-1]<=w) {
		 inc=prices[n-1]+knapsack(wts,prices,n-1,w-wts[n-1]);
	 }else {
		 exc=0+knapsack(wts,prices,n-1,w);
	 }
	 return Math.max(inc, exc);
 }
 public static int knapsackBU(int wts[],int prices[],int n,int w){
	int dp[][]=new int[n+1][w+1];
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=w;j++) {
			if(i==0 || j==0) {
			dp[i][j]=0;
		}else {
			int inc=0,exc=0;
			//include price
			if(wts[i-1]<=j) {
			inc=prices[i-1]+dp[i-1][j-wts[i-1]];
			exc=dp[i-1][j];
			dp[i][j]=Math.max(inc, exc);
		}else {
			dp[i][j]=dp[i-1][j];
		}
		}
	}
 }
	return dp[n][w];
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int wts[]=new int[n];
		int prices[]=new int[n];
		for(int i=0;i<n;i++) {
			wts[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
		}
		sc.close();
     System.out.println( knapsackBU(wts,prices,n,w));
	}

}

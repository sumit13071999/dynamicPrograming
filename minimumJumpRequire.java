package dynamicPrograming;

import java.util.Scanner;

public class minimumJumpRequire {
private static Scanner sc;
public static int jumps(int[] arr) {
	if(arr.length==0) {
		return -1;
	}
	int []jumps=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		jumps[i]=Integer.MAX_VALUE;
	}
	jumps[0]=0;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<=i+arr[i]&&j<arr.length;j++) {
			jumps[j]=Math.min(1+jumps[i], jumps[j]);
		}
		
	}
	return jumps[arr.length-1];
}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(jumps(arr));
		t--;}
	}

}

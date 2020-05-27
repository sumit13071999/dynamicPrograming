package dynamicPrograming;
import java.util.*;
public class countNoOfBinaryString {
	  static  int countStrings(int n) 
	    {
		  if(n==0)
			  return 0;
	        int a[] = new int [n]; 
	        int b[] = new int [n]; 
	        a[0] = b[0] = 1; 
	        for (int i = 1; i < n; i++) 
	        { 
	            a[i] = a[i-1] + b[i-1]; 
	            b[i] = a[i-1]; 
	        } 
	        return a[n-1] + b[n-1]; 
	    }  
	public static int fib(int n) {
	int []arr=new int[n+1];
		if(n==1 || n==0)
			return n+1;
		if(arr[n]!=0)
			return arr[n];
		int ans=fib(n-1)+fib(n-2);
		arr[n]=ans;
		return ans;
		
	}
	public static long fibIt(int n) {
		int arr[]=new int[n+1];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<n;i++)
			arr[i]=arr[i-1]+arr[i-2];
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0) {
    	  int n=sc.nextInt();
    	  System.out.println(countStrings(n));
    	  System.out.println("top down aproach");
    	  System.out.println(fib(n));
    	  t--;
      }
	}

}

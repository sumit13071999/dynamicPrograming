package dynamicPrograming;

public class fibonacci {
	public static long fibIt(int arr[],int n) {
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++)
			arr[i]=arr[i-1]+arr[i-2];
		return arr[n];
	}
	public static int fibST(int arr[],int n) {
		if(n<=0) {
			return n;
		}
		if(n<=1)
			return 1;
		if(arr[n]!=0)
			return arr[n];
		int f= fibST(arr,n-1)+fibST(arr,n-2);
		arr[n]=f;
		return f;
	}
public static int fib(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	return fib(n-1)+fib(n-2);
}
public static long starttime() {
	long st=System.currentTimeMillis();
	return st;
}
public static long endTime(long st) {
	long et=System.currentTimeMillis();
	return et-st;
}

	public static void main(String[] args) {
		int n=46;
		int arr[]=new int[n+1];
		long st=starttime();
      System.out.println(fibST(arr,n));
	      System.out.println("time="+endTime(st)+"ms");
	      st=starttime();
	      System.out.println(fibIt(arr,n));
      System.out.println("time="+endTime(st)+"ms");
		 st=starttime();
     System.out.println(fib(n));
      System.out.println("time="+endTime(st)+"ms");
	}

}

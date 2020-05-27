package dynamicPrograming;

public class countboardpath {
	public static long start;
	public static long end;
	public static void startAlgo() {
		start=System.currentTimeMillis();
	}
	public static long endAlgo() {
		end=System.currentTimeMillis();
		return end-start;
	}
public static int boardpath(int cc,int cv) {
	int count=0;
	if(cc<cv)
		return 0;
	if(cc==cv) {
		return 1;
	}
	for(int i=1;i<=6;i++)
		count+=boardpath(cc,cv+i);
	return count;
}
public static int boardpath(int end,int cv,int[] arr) {
	int count=0;
	if(end<cv)
		return 0;
	if(end==cv) {
		return 1;
	}
	if(arr[cv]!=0)
		return arr[cv];
	for(int i=1;i<=6;i++)
		count+=boardpath(end,cv+i,arr);
	arr[cv]=count;
	return count;
}
public static int cbpIS(int end,int curr) {
	int []strg=new int[end+1];
	//seed
	strg[end]=1;
	for(int i=end-1;i>=0;i--) {
		int count=0;
		for(int dice=1;dice<=6 && dice+i<strg.length;dice++) {
			count=count+strg[dice+i];
		}
		strg[i]=count;
	}
	return strg[curr];
}
	public static void main(String[] args) {
		int n=30;
		int arr[]=new int[n+1];
		startAlgo();
       System.out.println(boardpath(n,0,arr));
       System.out.println("take time to run = "+endAlgo()+"ms");
       startAlgo();
       System.out.println(boardpath(n,0));
       System.out.println("take time to run = "+endAlgo()+"ms");
	}

}

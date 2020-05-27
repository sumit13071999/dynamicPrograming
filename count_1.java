package dynamicPrograming;
import java.util.*;
public class count_1 {
	static int count_1(int a[], int n,   int k) 
{
		int temp=0;
		int templ=0;
int cnt0 = 0; 
int l = 0; 
int max_len = 0; 

// i decides current ending point 
for (int i = 0; i < n; i++) { 
if (a[i] == 0) 
cnt0++; 

// If there are more 0's move 
// left point for current ending 
// point. 
while (cnt0 > k) { 
if (a[l] == 0) 
cnt0--; 
l++; 
} 

max_len = Math.max(max_len, i - l + 1);
if(temp<max_len) {
	templ=l;
	temp=max_len;
}
} 
for(int i=templ;i<templ+max_len;i++) {
	if(a[i]==0)
		a[i]=1;
}

return max_len; 
} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println(count_1(arr,n,k));
       for(int i:arr) {
    	   System.out.print(i+" ");
       }
	}

}

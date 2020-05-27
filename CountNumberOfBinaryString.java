package dynamicPrograming;

public class CountNumberOfBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=4;
 int [] ones=new  int[n];
 int[] zeroes=new int[n];
 //seed
 zeroes[0]=1;
 ones[0]=1;
 for(int i=1;i<zeroes.length;i++) {
	 zeroes[i]=zeroes[i-1]+ones[i-1];
	 ones[i]=zeroes[i-1];
 }
 int ans=zeroes[n-1]+ones[n-1];
 System.out.println(ans);
	}

}

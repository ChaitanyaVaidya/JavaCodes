package Interview1;

public class MissingNumber {
	public static void main(String[] args) {
		int ar[]= {1,2,4,5,6};
		int n=ar.length;
		int sum1=0;
		int sum2=0;
		
		sum1=((n+1)*(n+2))/2;
		
		for (int i = 0; i < ar.length; i++) {
			sum2=sum2+ar[i];
		}
		System.out.println(sum1-sum2);
	}

}

package Part2;

public class MissingNo {
	
	public static int missingN(int[] arr,int n) {
	
	int sum2=0;
		
		int sum1=((n+1)*(n+2))/2;
		
		for (int i = 0; i < arr.length; i++) {
			sum2=sum2+arr[i];
		}
		
		return sum1-sum2;
	}

public static void main(String[] args) {
	int arr[]= {1,2,3,4,6,7,8};
	
	int n=arr.length;
	
	System.out.println(MissingNo.missingN(arr, n));
		
		
}
}

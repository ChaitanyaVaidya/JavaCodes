package Interview1;

public class MaxNo {
	
	public static void main(String[] args) {
		int ar[]= {1,5,4,9,15};
		int max=ar[0];
		for (int i = 0; i < ar.length; i++) {
			
		if(ar[i]>max) {
			max=ar[i];
		}
		}
		System.out.println(max);
	}

}

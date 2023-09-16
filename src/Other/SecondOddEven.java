package Other;

import java.util.Arrays;

public class SecondOddEven {
	public static void main(String[] args) {
		
		int ar[]= {-1,5,2,-3,4,6,7};
	//	String st = Arrays.toString(ar);
		
		int even[]=new int[1];
		int odd=0;
		int temp;
		for (int i = 0; i < ar.length; i=i+2) {
			
			for (int j = i+1; j < even.length; j=j+2) {
				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				//	System.out.print(ar[ar.length-2]);
				}
			}
			for (int j = 0; j < ar.length; j++) {
				even[i]=ar[i];
			}
		//	int j = ar[i];
				System.out.println(even[i]);
			
		
	
	}
		System.out.print(ar[ar.length-2]);}

}

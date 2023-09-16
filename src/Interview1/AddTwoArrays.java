package Interview1;

public class AddTwoArrays {
	public static void main(String[] args) {
		int a1[]= {2,9,5};
		int a2[]= {4,6,7};
		int sum1=0;
		int sum2=0;
		
		for (int i = 0; i < a2.length; i++) {
			sum1=sum1*10+a1[i];
			sum2=sum2*10+a2[i];
		}
		
		System.out.println(sum1+sum2);
	}

}

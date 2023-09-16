package Other;

public class FiveToEight {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,8,9};
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=5 && a[i]<=8) {
				sum1=10*sum1+a[i];
			}else {
				sum2=sum2+a[i];
			}
		}
		System.out.println(sum1+sum2);
	}

}

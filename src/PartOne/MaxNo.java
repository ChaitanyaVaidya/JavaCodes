package PartOne;

public class MaxNo {
	public static void main(String[] args) {
		int a[]= {1,6,9,4,3};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

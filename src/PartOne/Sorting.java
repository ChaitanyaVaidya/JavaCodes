package PartOne;

public class Sorting {
	public static void main(String[] args) {
		int a[]= {1,6,9,4,3};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		System.out.println(a[i]);
		
	}
		System.out.println(a[1]);
		}

}

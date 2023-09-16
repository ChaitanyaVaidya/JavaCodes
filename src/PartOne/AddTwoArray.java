package PartOne;

public class AddTwoArray {
	public static void main(String[] args) {
		int a[]= {2,8,3};
     	int b[]= {1,2,9};
     	
     	int a1=0;
     	int a2=0;
     	int a3;
     	
     	for (int i = 0; i < b.length; i++) {
			a1=10*a1+a[i];
			a2=10*a2+b[i];
		}
     	System.out.println(a1+a2);
	}

}

package PartOne;

public class FibonnaciEx {
	public static void main(String[] args) {
		int n=5,c;
		int a=0,b=1;
		
		for (int i = 0; i < n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}

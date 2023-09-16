package Interview1;

public class FactorialEx {
	public static void main(String[] args) {
		int n=5;
		
//		int fact=1;
//		
//		for (int i = 1; i <= n; i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		
		int a=0;
		int b=1;int c;
		
		for (int i = 0; i <=n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
		
	}

}

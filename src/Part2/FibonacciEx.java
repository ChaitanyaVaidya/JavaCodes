package Part2;

public class FibonacciEx {
	public static void main(String[] args) {
		int a=0,b=1;
		int c;
		
		for (int i = 0; i < 6; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

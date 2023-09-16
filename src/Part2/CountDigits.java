package Part2;

public class CountDigits {
	public static void main(String[] args) {
		int a=64665;
		int count=0;
		
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}

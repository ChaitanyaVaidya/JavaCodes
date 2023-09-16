package Part2;

public class PrimeNo {
	public static void main(String[] args) {
		int n=14;
		int count=0;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("pr");
		}else {
			System.out.println("np");
		}
	}

}

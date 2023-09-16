package Interview1;

import java.util.stream.IntStream;

public class PrimeEx {
	public static void main(String[] args) {
		int n=6;
		int count=0;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
		
		boolean nm = IntStream.range(2, n).noneMatch(s->n%s==0);
		System.out.println(nm);
	}

}

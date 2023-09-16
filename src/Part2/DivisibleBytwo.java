package Part2;

import java.util.Arrays;
import java.util.List;

public class DivisibleBytwo {
	public static void main(String[] args) {
		Integer [] a= {2,6,8,10,16};
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		if(count==a.length) {
			System.out.println("all");
		}else {
			System.out.println("no");
		}
		
		List<Integer> al = Arrays.asList(a);
		boolean allMatch = al.stream().allMatch(s->s%2==0);
		System.out.println(allMatch);
	}

}

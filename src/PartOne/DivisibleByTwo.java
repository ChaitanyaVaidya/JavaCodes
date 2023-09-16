package PartOne;

import java.util.Arrays;
import java.util.List;

public class DivisibleByTwo {
	public static void main(String[] args) {
		Integer [] a= {2,7,8,10,16};
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		if(count==a.length) {
			System.out.println("all");
		}else {
			System.out.println("not all");
		}
		
		List<Integer> al = Arrays.asList(2,7,8,10,16);
		
		boolean match = al.stream().allMatch(s->s%2==0);
		
		if(match) {
			System.out.println("all");
		}else {
			System.out.println("not all");
		}
	}

}

package Interview1;

import java.util.Arrays;
import java.util.List;

public class DivisibleByTwo {
	
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2,6,8,10,16);
		
		boolean allMatch = al.stream().allMatch(s->s%2==0);
		
		System.out.println(allMatch);
	}

}

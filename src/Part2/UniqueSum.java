package Part2;

import java.util.Arrays;
import java.util.List;

public class UniqueSum {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(5,5,4,9);
		
		int sum = al.stream().distinct().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}

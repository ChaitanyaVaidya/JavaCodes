package PartOne;

import java.util.Arrays;
import java.util.List;

public class UniqueSum {
	public static void main(String[] args) {
		List<Integer> us = Arrays.asList(5,5,3,2,3);
		
		 int sm = us.stream().distinct().mapToInt(Integer::intValue).sum();
		
		System.out.println(sm);
	}

}

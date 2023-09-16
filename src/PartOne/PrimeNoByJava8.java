package PartOne;

import java.util.stream.IntStream;

public class PrimeNoByJava8 {
	public static void main(String[] args) {
		
		int a=24;
		
		boolean noneMatch = IntStream.range(2, a).noneMatch(n->a%n==0);
		
		System.out.println(noneMatch);
	}

}

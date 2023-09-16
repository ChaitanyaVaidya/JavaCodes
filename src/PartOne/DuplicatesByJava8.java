package PartOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicatesByJava8 {
	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(10,20,10,40,50,20,10);
		
		HashSet<Integer> set=new HashSet<>();
		
		  Set<Integer> cl = al.stream().filter(a->!set.add(a)).collect(Collectors.toSet());
		
		System.out.println(cl);
		
		int max = al.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
		
		System.out.println(max);
	}

}

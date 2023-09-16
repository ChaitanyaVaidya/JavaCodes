package PartOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,5,1,2);
		
	//	List<Integer> cn2 = al.stream().distinct().collect(Collectors.toList());
		
		List<Integer> cn = al.stream().distinct().collect(Collectors.toList());
		System.out.println(cn);
	}

}

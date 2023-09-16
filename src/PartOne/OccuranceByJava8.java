package PartOne;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceByJava8 {
	public static void main(String[] args) {
		
		String str="My name is My name";
		
		List<String> al = Arrays.asList(str.split(" "));
		
		Map<String, Long> cm = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(cm);
	}

}

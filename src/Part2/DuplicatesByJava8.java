package Part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesByJava8 {
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(10,20,10,40,50,20,10);
		
		Set<Integer> set=new HashSet<>();
		
		Set<Integer> collect = al.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println(collect);
	}

}

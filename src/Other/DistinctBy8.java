package Other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class DistinctBy8 {
	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(10,15,10,40,50);
		
		
		List<Integer> ds = al.stream().distinct().collect(Collectors.toList());
		System.out.println(ds);
		
		Set<Integer> cl = al.stream().filter(s->Collections.frequency(al, s)>1).collect(Collectors.toSet());
		System.out.println(cl);
	}

}

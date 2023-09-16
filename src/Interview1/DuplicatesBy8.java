package Interview1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesBy8 {
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(10,20,10,40,50,20,10);
		
		HashSet<Integer> hs=new HashSet<>();
		
		Set<Integer> cl = al.stream().filter(s->!hs.add(s)).collect(Collectors.toSet());
		
		System.out.println(cl);
	}

}

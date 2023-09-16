package Interview1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceBy8 {
	public static void main(String[] args) {
		List<String> al = Arrays.asList("my","name","my");
		
		Map<Integer, List<String>> cl = al.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(cl);
	}

}

package Interview1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountMoreThan {
	public static void main(String[] args) {
		String [] st= {"my", "name", "is", "chaitanya", "vidyadhar", "vaidya","vschasy"};
		
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()>5) {
				System.out.println(st[i]);
			}
		}
		
		List<String> al = Arrays.asList(st);
		List<String> cl = al.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(cl);
	}

}

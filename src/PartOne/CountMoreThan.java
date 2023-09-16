package PartOne;

import java.util.Arrays;
import java.util.List;

public class CountMoreThan {
	public static void main(String[] args) {
		String [] st= {"my", "name", "is", "chaitanya", "vidyadhar", "vaidya","vschasy"};
		int count=0;
		
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()>5) {
				count++;
			}
		}
		System.out.println(count);
		
		List<String> al = Arrays.asList(st);
		
		long count2 = al.stream().filter(a->a.length()>5).count();
		
		System.out.println(count2);
	}

}

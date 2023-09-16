package PartOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NameSorting {
	
	public static void main(String[] args) {
		 List<String> st= Arrays.asList("kaka","nana","anna");
		 
		 List<String> sa = st.stream().sorted().collect(Collectors.toList());
		 
		 System.out.println(sa);
	}

}

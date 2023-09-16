package PartOne;

import java.util.Arrays;
import java.util.List;

public class OddAndEven {
	public static void main(String[] args) {
		 List<Integer> ls=Arrays.asList(1,2,3,4,5,6);
		 
		// ls.stream().filter(s->s%s!=0).forEach(a->System.out.print(a));
		 ls.stream().filter(s->s%2==0).forEach(a->System.out.println(a));
	     ls.stream().filter(s->s%2!=0).forEach(a->System.out.println(a));	 
	}

}

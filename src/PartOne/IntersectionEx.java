package PartOne;

import java.util.HashSet;
import java.util.Set;

public class IntersectionEx {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		int b[]= {5,6,4,7};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int n:a) {
			s.add(n);
			
		}
		for (int i = 0; i < b.length; i++) {
			
		if(s.contains(b[i])) {
			System.out.println(b[i]);
		}
	}
	}
}

package Interview1;

import java.util.HashSet;

public class IntersectionEx {
	public static void main(String[] args) {
		int a1[]= {1,2,4,5};
		int a2[]= {7,4,5,8};
		
	
		HashSet<Integer> hs=new HashSet<>();
		
		for(int n:a1) {
			hs.add(n);
		}
		
		for (int i = 0; i < a2.length; i++) {
			if(hs.contains(a2[i])) {
				System.out.println(a2[i]);
			}
		}
	}

}

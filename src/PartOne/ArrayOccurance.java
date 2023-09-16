package PartOne;

import java.util.HashMap;
import java.util.Map;

public class ArrayOccurance {
	public static void main(String[] args) {
		String st="Occurancer";
		
		int [] ai= {1,2,3,4,1,2,1};
		
		char[] ca = st.toCharArray();
		
		Map<Character, Integer> mp=new HashMap<>();
		
		Map<Integer, Integer> im=new HashMap<>();
		int count=0;
		
		for (int i = 0; i < ai.length; i++) {
			count=0;
			for (int j = 0; j < ai.length; j++) {
				if(ai[i]==ai[j]) {
					count++;
				}
				im.put(ai[i], count);
			}
		}
		System.out.println(im);
		
//		for (int i = 0; i < ca.length; i++) {
//			count=0;
//			for (int j = 0; j < ca.length; j++) {
//				if(ca[i]==ca[j]) {
//					count++;
//				}
//				mp.put(ca[i], count);
//			}
//		}
//		System.out.println(mp);
	}

}

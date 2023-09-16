package Part2;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String s1="chaitanya";
		
		int [] ai= {1,2,3,4,1,2,1};
		
		char[] ch = s1.toCharArray();
		
		Map<Character, Integer> mp=new HashMap<>();
		
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			count=0;
			for (int j = 0; j < ch.length; j++) {
				
			
			if(ch[i]==ch[j]) {
				count++;
			}
		}
			mp.put(ch[i], count);
	}
	System.out.println(mp);	
	}

}

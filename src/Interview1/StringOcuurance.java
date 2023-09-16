package Interview1;

import java.util.HashMap;
import java.util.Map;

public class StringOcuurance {
	public static void main(String[] args) {
		String s1="i am chaitanya, i am from satara ";
		
		String[] ch = s1.split(" ");
		
		Map<String, Integer> mp=new HashMap<>();
		
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			count=0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i].equals(ch[j])) {
					count++;
				}
			}
			mp.put(ch[i], count);
		}
		System.out.println(mp);
	}

}

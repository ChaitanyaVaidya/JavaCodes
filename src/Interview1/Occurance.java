package Interview1;

import java.util.HashMap;
import java.util.Scanner;

public class Occurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String[] sp = s.split(" ");
	//	char[] ca = s.toCharArray();
		int count=0;
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		for (int i = 0; i < sp.length; i++) {
			count=0;
			for (int j = 0; j < sp.length; j++) {
				
				if(sp[i].equals(sp[j])) {
					count++;
				}
			}
		
		hm.put(sp[i], count);
	}
		System.out.println(hm);
	}
}

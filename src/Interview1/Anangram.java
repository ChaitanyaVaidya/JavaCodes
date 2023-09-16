package Interview1;

import java.util.Arrays;

public class Anangram {
	public static void main(String[] args) {
		String s1="Race";
		String s2="Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean equals=Arrays.equals(ch1, ch2);
		
		if(equals) {
			System.out.println("anan");
		}else {
			System.out.println("not");
		}
	}

}

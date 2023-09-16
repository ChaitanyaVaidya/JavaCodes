package Interview1;

import java.util.Scanner;

public class CamelCount {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int n=1;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				n++;
			}
		}
		
		System.out.println(n);
	}

}

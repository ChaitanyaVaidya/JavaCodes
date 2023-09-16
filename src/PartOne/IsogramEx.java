package PartOne;

public class IsogramEx {
	public static void main(String[] args) {
		String s="chaita";
		s.toLowerCase();
		char[] ch = s.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					count++;
				}
			}
		}
		if(count!=0) {
			System.out.println("No");
		}else {
			System.out.println("iso");
		}
	}

}

package Part2;

public class IsogramEx {
	public static void main(String[] args) {
		String s1="cvasdy";
		
		char[] ch = s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
				count++;
				}
			}
		}
		if(count==0) {
			System.out.println("Iso");
		}else {
			System.out.println("not");
		}
	}

}

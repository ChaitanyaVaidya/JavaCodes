package Part2;

public class CheckDuplicate {
	public static void main(String[] args) {
		
		String s1="chava";
		
		char[] ch = s1.toCharArray();
		int temp=0;
		
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					temp++;
				}
			}
		}
		if(temp>0) {
			System.out.println("s");
		}else {
			System.out.println("n");
		}
	}

}

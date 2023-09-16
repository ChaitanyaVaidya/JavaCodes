package Interview1;

public class CheckDuplicates {
	public static void main(String[] args) {
		String st="penpst";
		
		char[] ch = st.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					System.out.println(ch[i]);
				}
			}
		}
		System.out.println(count);
	}

}

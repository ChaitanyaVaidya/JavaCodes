package PartOne;

public class CheckDuplicates {
	public static void main(String[] args) {
		String st="penp";
		
		char[] ca = st.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ca.length; i++) {
			
			for (int j = i+1; j < ca.length; j++) {
				if(ca[i]==ca[j]) {
					count++;
					System.out.println(ca[i]);
				}
			}
		}
		if(count>=1) {
			System.out.println("s");
		}else {
			System.out.println("n");
		}
	}

}

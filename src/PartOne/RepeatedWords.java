package PartOne;

public class RepeatedWords {
	
	public static void main(String[] args) {
		
		String st="My name is my ";
		
		st=st.toLowerCase();
		
		String [] ar=st.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i].equals(ar[j])) {
					System.out.println(ar[i]);
				}
				
			}
			
			//System.out.println(ar[i]);
		}
		
		
	}

}

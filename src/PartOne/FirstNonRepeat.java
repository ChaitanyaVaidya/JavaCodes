package PartOne;

public class FirstNonRepeat {
	public static void main(String[] args) {
//		String st="mynyme";
//		
//		char[] ca = st.toCharArray();
//		
//		for(char np:ca) {
//		if(st.indexOf(np)==st.lastIndexOf(np)) {
//			System.out.println(np);
//			break;
//		}}
		
		String s="stress";
		
		char[] ca = s.toCharArray();
		
		for(char c:ca) {
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

}

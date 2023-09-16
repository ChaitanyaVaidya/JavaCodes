package Interview1;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String st="mynyme";
		char[] ch = st.toCharArray();
		
		for (char s:ch) {
			
		if(st.indexOf(s)==st.lastIndexOf(s)) {
			System.out.println(s);
			break;
		}
	}}

}

package Other;

import java.util.Arrays;
import java.util.List;

public class FirstAndLast {
	
	public static void main(String[] args) {
		
		List<String> al = Arrays.asList("abc","mnm","xlx","fkf");
		
	    String st[]={"abc","mnm","xlx","fkf"};
	    
	    for (int i = 0; i < st.length; i++) {
			char[] ch = st[i].toCharArray();
			
			for(char ca : ch) {
				st[i].charAt(0)==st[i].charAt(2);
			}
		}
	}

}

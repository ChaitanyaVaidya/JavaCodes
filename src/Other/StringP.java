package Other;

import java.util.ArrayList;
import java.util.List;

public class StringP {
	
	public static void main(String[] args) {
		
			   int x = 10;
			   System.out.println(x+10);
			   int y = x++ * 2 + ++x;
			   System.out.println(y);
			 
			   String s1="abcde";
			    s1.trim();
			   s1.toUpperCase();
			   String sb = s1.substring(1,4);
			   System.out.println(sb);
			
			   List list = new ArrayList();
		        list.add("hello");
		        list.add(2.2);
		        System.out.print(list.get(0) instanceof Object);
		        System.out.print(list.get(1) instanceof Double);
		
//		for ( ;; ) {
//			
//		}System.out.println(y);
			   
				   }
		
//		String s1="cv";
//		
//		System.out.println(6-4+s1+6/6);
	
}

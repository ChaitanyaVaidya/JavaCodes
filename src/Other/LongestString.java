package Other;

import java.util.Arrays;
import java.util.List;

public class LongestString {
	
	public static void main(String[] args) {
		String [] name= {"chait","vidyadhar","vaidyaaaaaaaaaaaaaa"};
		
		String max=name[0];
		
		for (int i = 0; i < name.length; i++) {
			
			
				if(max.length()<name[i].length()) {
					max=name[i];
				//	System.out.println(max);
				}
			
			//System.out.println(max);
		}
		System.out.println(max);
		
		List<String> asList = Arrays.asList(name);
		String sr = asList.stream().reduce((max1, max2)->max1.length()>max2.length()?max1:max2).get();
		System.out.println(sr);
//		
//		int [] arr= {5,9,15,7,4};
//		
//		int max=arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//				
//			if(arr[i]>max) {
//				max=arr[i];
//			
//			}
//	}
//		System.out.println(max);
//		
	}
}

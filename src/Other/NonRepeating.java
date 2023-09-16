package Other;

import java.util.HashMap;

public class NonRepeating {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,2,4};
		
		int count=0;
		
		//HashMap<Integer, Integer> hm=new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr.length; j++) {
				
	       if(arr[i]==arr[j]) {
	    	   count++;
	       }
	    	   
	}
			if(count==1) {
				System.out.println(arr[i]);
			}
			
	}
		

	}}

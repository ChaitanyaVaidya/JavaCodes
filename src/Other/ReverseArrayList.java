package Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(7);
		ls.add(5);
		ls.add(9);
		
		List<Integer> cl = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(cl);
		
		Comparator cm=Collections.reverseOrder();
		Collections.sort(ls,cm);
		System.out.println(ls);
		
		Object[] arr = ls.stream().sorted().toArray();
		Object temp;
		for (int i = 0; i < arr.length; i++) {
			 temp=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
	}

}

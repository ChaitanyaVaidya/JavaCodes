package PartOne;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(9);
		
		Iterator itr=al.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
	

}

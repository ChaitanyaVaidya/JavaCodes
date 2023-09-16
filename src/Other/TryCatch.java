package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class TryCatch {
	public static void main(String[] args) {
	
		    
		        PriorityQueue<Integer> queue = new PriorityQueue<>();
		        queue.add(4);
		        queue.add(3);
		        queue.add(2);
		        queue.add(1);

		        while (queue.isEmpty() == false) {
		            System.out.printf("%d", queue.remove());
		        }
		    
	}

}

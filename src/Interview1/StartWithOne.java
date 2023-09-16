package Interview1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {
	public static void main(String[] args) {
		int arr[]= {10,13,25,35,15};
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>9 && arr[i]<20) {
//				System.out.println(arr[i]);
//			}
//		}
		
		List<int[]> al = Arrays.asList(arr);
		al.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}

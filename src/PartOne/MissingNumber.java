package PartOne;

import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7,8};
		int n=a.length,sum2 = 0;
		
		int sum1=((n+1)*(n+2))/2;
		
		for (int i = 0; i < a.length; i++) {
			sum2=sum2+a[i];
		}
		
		System.out.println(sum1-sum2);
		
		
		
		
		
//		HashSet<Integer> hs=new HashSet<>();
// 		
//		for(int n:a) {
//			hs.add(n);
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			if(!hs.contains(i)) {
//				System.out.println(i);
//			}
//		}
	}

}

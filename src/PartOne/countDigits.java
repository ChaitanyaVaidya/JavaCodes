package PartOne;

public class countDigits {
	public static void main(String[] args) {
		int n=4551;
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}

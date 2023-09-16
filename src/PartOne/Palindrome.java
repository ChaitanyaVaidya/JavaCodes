package PartOne;

public class Palindrome {
	public static void main(String[] args) {
		int n=253,r,s=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(temp==s) {
			System.out.println("pali");
		}else {
			System.out.println("no");
		}
	}

}

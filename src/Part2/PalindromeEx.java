package Part2;

public class PalindromeEx {
	public static void main(String[] args) {
		int n=121;
		int r,s=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(temp==s) {
			System.out.println("pa");
		}else {
			System.out.println("np");
		}
	}

}

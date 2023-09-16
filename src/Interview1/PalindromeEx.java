package Interview1;

public class PalindromeEx {
	public static void main(String[] args) {
		int n=5;
		
		int r,s=0;
		int temp=n;
		
	while(n>0) {
		r=n%10;
		s=(s*10)+r;
		n=n/10;
		
	}
	if(temp==s) {
		System.out.println("p");
	}else {
		System.out.println("n");
	}
		
	
	}

}

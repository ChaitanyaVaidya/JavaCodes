package Interview1;

public class CountDigits {
	public static void main(String[] args) {
		int a=45785;
		int count=0;
		
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}

package Interview1;

public class DifferenceEx {
	public static void main(String[] args) {
		int a1=0,a2=0;
		int m=30,n=6;
		
		for (int i = 0; i <=m; i++) {
			if(i%n==0) {
				a1=a1+i;
			}else {
				a2=a2+i;
			}
		}
		System.out.println(a2-a1);
		
	}

}

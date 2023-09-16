package Part2;

public class AddTwoArray {
	public static void main(String[] args) {
		int a1[]= {1,8,5};
		int a2[]= {2,8,5};
		
		int a=0;
		int b=0;
		int a3 = 0;
		
		for (int i = 0; i < a2.length; i++) {
			a=10*a+a1[i];
			b=10*b+a2[i];
		}
		System.out.println(a+b);
	}

}

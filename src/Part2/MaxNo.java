package Part2;

public class MaxNo {
	public static void main(String[] args) {
		int a1[]= {4,5,9,15,10};
		int max=a1[0];
		
		for (int i = 0; i < a1.length; i++) {
			if(max<a1[i]) {
				max=a1[i];
			}
		}
		System.out.println(max);
	}

}

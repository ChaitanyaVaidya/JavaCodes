package Interview1;

public class OddFirst {
	public static void main(String[] args) {
		int [] n= {3,5,2,4,7,8};
		int temp;
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i+1; j < n.length; j++) {
				
				if(n[j]%2!=0) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.println(n[i]);
		}
		
	}

}

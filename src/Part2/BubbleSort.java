package Part2;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[]= {1,5,4,7,6};
		
		int temp=0;
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		
	}

}

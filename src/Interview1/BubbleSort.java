package Interview1;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {9,4,3,5,2,8};
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
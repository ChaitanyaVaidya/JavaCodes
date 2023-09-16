package Part2;

public class SquareOfArray {
	public static void main(String[] args) {
		int arr[]= {1,4,2,5};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]*arr[i]);
		}
	}

}

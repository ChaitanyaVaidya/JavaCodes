package Other;

public class ArrayEx {
	public static void main(String[] args) {
		  int x;
	        x = 5;
	        int y=5;
	        {
	             y = 6;
	            System.out.println(x + " " + y);
	        }
	        System.out.println(x + " " + y);
		
		int[][] array=new int[3][3];
		  array[0] = new int[]{1, 2, 3};
		          array[1] = new int[]{4, 5, 6};
		           array[2] = new int[]{7, 8, 9};
		           for (int i = 0; i < 3; i++)
		               System.out.print(array[i][0]); 
	}

}

package Part2;

public class MatrixAddition {
	public static void main(String[] args) {
		int a1[][]= {{1,2},{1,2}};
		int a2[][]= {{2,1},{2,1}};
		
		int a3[][]= new int[2][2];
		
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3.length; j++) {
				a3[i][j]=0;
				
				a3[i][j]=a3[i][j]+a1[i][j]*a2[i][j];
				System.out.print(a3[i][j]+" ");
						
			}
		
		System.out.println();
	}}

}
